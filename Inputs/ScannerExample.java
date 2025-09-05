package Inputs;

import java.util.Scanner; // Import Scanner class

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask for user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reads a whole line of text

        // Ask for user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads an integer

        // Ask for user's height
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble(); // Reads a decimal number

        // Display the results
        System.out.println("\nHello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your height is " + height + " meters.");

        // Close the scanner (good practice to free resources)
        scanner.close();
    }
}

