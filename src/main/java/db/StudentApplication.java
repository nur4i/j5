package db;

import java.sql.*;
import java.util.Scanner;

public class StudentApplication {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:d:/lesson/j5.db")) {
            System.out.println("Student's name:");
            String name = in.nextLine();

            System.out.println("Student's grade:");
            double grade = in.nextDouble();

            System.out.println("Student's course:");
            int course = in.nextInt();

            Statement subjectsStmt = conn.createStatement();
            ResultSet resultSet = subjectsStmt.executeQuery("SELECT * FROM subjects");

            System.out.println("Which subject will you choose:");
            while (resultSet.next()) {
                String subject = resultSet.getString("name");
                int id = resultSet.getInt("id");
                System.out.println(id + ") " + subject);
            }

            int selectedSubject = in.nextInt();

            // DB part
//            Statement statement = conn.createStatement();
//            statement.executeUpdate("INSERT INTO student(name, grade) " +
//                    "VALUES('" + name + "', " + grade + ")");

            PreparedStatement statement = conn.prepareStatement("INSERT INTO student(name, grade, course) " +
                    "VALUES(?, ?, ?)");
            statement.setString(1, name);
            statement.setDouble(2, grade);
            statement.setInt(3, course);

            statement.executeUpdate();
            System.out.println("New student created");

            ResultSet generatedKeys = statement.getGeneratedKeys();
            generatedKeys.next();
            int studentId = generatedKeys.getInt(1);

            System.out.println("Student id = " + studentId);

            statement = conn.prepareStatement("INSERT INTO student_subject VALUES(?, ?)");
            statement.setInt(1, selectedSubject);
            statement.setInt(2, studentId);
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Some error occurred, please try later");
        }

    }
}
