package ControlFlow.CompoundConditions;

public class AndOrCondition {
    public static void main(String[] args) {
        int age = 25;
        boolean hasLicense = true;
        boolean hasCar = false;

        if ((age >= 18 && hasLicense) || hasCar) {
            System.out.println("You are eligible to drive.");
        } else {
            System.out.println("You are not eligible to drive.");
        }
    }
}
