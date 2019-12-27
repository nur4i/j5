package db;

import java.sql.SQLException;
import java.util.ArrayList;

public class EntityExample {
    public static void main(String[] args) throws SQLException {
        DbConnection manager = new DbConnection();
        manager.connect();

        ArrayList<Student> allStudents = manager.getAllStudents();
        for (Student s : allStudents) {
            System.out.println(s);
        }

        Student s = new Student();
        s.setName("Aizhan");
        s.setCourse(1);
        s.setGrade(3.5);

        int stId = manager.insertStudent(s);
        System.out.println("New student id = " + stId);

        s = new Student();
        s.setName("Aibek");
        s.setCourse(1);
        s.setGrade(1.0);

        stId = manager.insertStudent(s);
        System.out.println("New student id = " + stId);

    }
}
