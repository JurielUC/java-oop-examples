package ControlFlow;

import java.util.Scanner;

public class One {
    public static void main(String[]args){
        try (Scanner z = new Scanner(System.in)) {
            int n;
            System.out.print("Enter number of integers: ");
            n = z.nextInt();
            
            int[] num = new int[n];
            
            for(int i=0;i<n;i++) {
                System.out.print("Enter integer "+(i+1)+": ");
                num[i] = z.nextInt();
            }
            System.out.printf("Mean of the array elements: %.2f",getArrayMean(num));
        }
    }
    public static double getArrayMean(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        return(double)sum/arr.length;
    }
}