package Association;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

class Course {
    String title;

    Course(String title) {
        this.title = title;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        Course course = new Course("OOP in Java");

        // Association: Student is associated with Course
        System.out.println(student.name + " is enrolled in " + course.title);
    }
}
