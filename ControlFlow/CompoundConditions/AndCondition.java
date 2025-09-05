package ControlFlow.CompoundConditions;

public class AndCondition {
    public static void main(String[] args) {
        int age = 18;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("You are allowed to enter.");
        } else {
            System.out.println("Entry denied.");
        }
    }
}
