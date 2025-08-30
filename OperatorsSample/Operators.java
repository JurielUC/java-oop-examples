package OperatorsSample;

public class Operators {
    public static void main(String[] args) {
        int num = 0;  // Declare and initialize num with 0
        System.out.println(num);  // Output: 0
        
        num = 34;  // Assign 34 to num
        System.out.println(num);  // Output: 34
        
        num--;  // Decrement num by 1 (num = num - 1)
        System.out.println(num);  // Output: 33
        
        num += 45;  // Add 45 to num (num = num + 45)
        System.out.println(num);  // Output: 78
        
        num++;  // Increment num by 1 (num = num + 1)
        System.out.println(num);  // Output: 79
        
        num = num % 17;  // Get the remainder when num is divided by 17
        System.out.println(num);  // Output: 11
        
        num %= 2;  // Get the remainder when num is divided by 2
        System.out.println(num);  // Output: 1
    }
}

