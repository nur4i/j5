package db;

import java.sql.*;

public class DbTest2 {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:d:/lesson/j5.db");

        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM student WHERE grade = ? AND name = ? ORDER BY id");

        stmt.setString(2, "Jerry");
        stmt.setDouble(1, 2.0);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            System.out.println(id + "\t" + name);
        }

        conn.close();

    }
}
