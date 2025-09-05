package ControlFlow.PresentationExample;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   // Create Scanner object

        System.out.print("Enter value in kilometers: ");
        int km = input.nextInt(); // Read user input

        int m = km * 1000;  // Convert kilometers to meters

        System.out.println(km + " kilometers is equivalent to " + m + " meters.");

        input.close();  // Close Scanner
    }
}
