package ControlFlow.CompoundConditions;

public class NotCombineCondition {
    public static void main(String[] args) {
        int age = 17;
        boolean hasParentalConsent = true;

        if (!(age >= 18) && hasParentalConsent) {
            System.out.println("You can join with parental consent.");
        } else {
            System.out.println("You can join freely or you are not allowed.");
        }
    }
}
