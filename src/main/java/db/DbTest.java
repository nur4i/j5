package db;

import java.sql.*;

public class DbTest {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:d:/lesson/j5.db");

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM student ORDER BY id");
//        System.out.println("id\tname");

        ResultSetMetaData metaData = rs.getMetaData();

        int columnCount = metaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = metaData.getColumnName(i);
            System.out.print(columnName + "\t");

            metaData.getColumnType(i);
            metaData.getColumnTypeName(i);
        }
        System.out.println();

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            System.out.println(id + "\t" + name);
        }

//        int res = stmt.executeUpdate("INSERT into student VALUES(6, 'Brin', 1.5, 4)");
//        System.out.println(res);

//        int res = stmt.executeUpdate("UPDATE student SET course = 3 where course = 2");
//        System.out.println(res);

//        int res = stmt.executeUpdate("DELETE FROM student WHERE course = 4");
//        System.out.println(res);


        conn.close();

    }
}
