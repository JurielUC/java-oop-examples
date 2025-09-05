package ControlFlow;

import java.util.Scanner;
 
 public class Two{
     public static void main(String[] args){
         try (Scanner z = new Scanner(System.in)) {
            System.out.print("Enter the maximum number for the multiplication table: ");
             int maxNumber = z.nextInt();
             
             int[][] table = new int[maxNumber + 1][maxNumber + 1];
             
             for(int i = 1;i<=maxNumber; i++){
                 for(int j = 1;j<=maxNumber;j++){
                     table[i][j] = i * j;
                 
             }
    }
    
    System.out.println("\nMultiplication Table: ");
    for(int i =1;i<=maxNumber;i++){
             for(int j = 1;j<=maxNumber;j++){
                 System.out.printf("%4d",table[i][j]);
             }
             System.out.println();
    }
         }
     
     }
     
 }