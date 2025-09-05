package ControlFlow.PresentationExample;

import java.util.Scanner;

class WithIfElseCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for km: ");
        int km = input.nextInt();   // Read user input
        int m = 0; // Initialize meters

        if (km > 0) { // Only convert if km is positive
            m = km * 1000;
            System.out.println(km + " kilometers is equivalent to " + m + " meters.");
        } 
        else {
            System.out.println("Please enter a positive value for kilometers.");
        }

        input.close(); // Close scanner
    }
}
