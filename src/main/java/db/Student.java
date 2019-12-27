package db;

public class Student {

    private int id;
    private String name;
    private double grade;
    private int course;

    public Student() {
    }

    public Student(int id, String name, double grade, int course) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", course=" + course +
                '}';
    }
}
