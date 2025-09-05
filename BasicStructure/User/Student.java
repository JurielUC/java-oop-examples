// Package declaration (optional, used for organizing classes into groups)
package BasicStructure.User;

// Import statement (brings external classes/libraries into the program)
import java.util.*;

// Class definition (encapsulates attributes and methods)
public class Student {
    // Attributes (data)
    String name;
    int age;

    // Method (behavior)
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // main() method – where the program starts execution
    public static void main(String[] args) {
        // Statement: create an object of Student
        Student s1 = new Student();

        // Statements: assign values to object attributes
        s1.name = "Alice";
        s1.age = 18;

        // Placeholder
        System.out.printf("Placeholder: Name: %s, Age: %d", s1.name, s1.age);
        System.out.println("\nW/O Placeholder: Name: "+ s1.name +" Age: "+s1.age);

        // Statement: call method to display info
        s1.displayInfo();

        // Using imported Scanner (example of library usage)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: \f");
        String inputName = scanner.nextLine();
        System.out.println("Hello, " + inputName + "!");

        scanner.close();
    }
}