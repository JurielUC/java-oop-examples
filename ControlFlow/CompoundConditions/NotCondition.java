package ControlFlow.CompoundConditions;

public class NotCondition {
    public static void main(String[] args) {
        boolean isRainy = false;

        if (!isRainy) {
            System.out.println("Let's go outside, the weather is clear!");
        } else {
            System.out.println("Better stay indoors, it's raining.");
        }
    }
}
