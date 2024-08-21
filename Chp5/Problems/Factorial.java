package Chp5.Problems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        // Q. Find Factorial of number
        // Take number as user input

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        int factorial = 1;
        for(int i = a ; i > 0 ; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of "+ a + " = " + factorial);
    }
}
