package Example;

class Student { // classs
    String firstName, lastName; // attributes
    // String lastName;
    int age;

    void learn() { // method
        System.out.println(firstName + " " + lastName + " is learning OOP.");
    }

    void sleep() {
        System.out.println(firstName + " is sleeping in the class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(); // Object
        student1.firstName = "Patrick";
        student1.lastName = "Star";
        student1.age = 21;

        Student student2 = new Student();
        student2.firstName = "James";
        student2.age = 21;

        student1.learn();
        student1.sleep();
    }
}