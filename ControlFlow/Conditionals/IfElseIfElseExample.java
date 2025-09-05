package ControlFlow.Conditionals;

import java.util.Scanner;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score;

        Scanner number = new Scanner(System.in);
        System.out.print("Enter number of integers: ");
        score = number.nextInt();

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}

