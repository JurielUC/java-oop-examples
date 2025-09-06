package ControlFlow.Conditionals;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        // int number = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 5) {
            System.out.println("The number is greater than 5.");
        }

        scanner.close();
    }
}

