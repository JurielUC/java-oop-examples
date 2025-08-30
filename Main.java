import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print a welcome message
        System.out.println("Hello, World!");

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask for user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Nice to meet you, " + name + "!");

        // Ask for two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Perform a simple calculation
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
