package ControlFlow.CompoundConditions;

public class OrCondition {
    public static void main(String[] args) {
        boolean hasTicket = false;
        boolean isVIP = false;

        if (hasTicket || isVIP) {
            System.out.println("You can watch the concert.");
        } else {
            System.out.println("Access denied.");
        }
    }
}
