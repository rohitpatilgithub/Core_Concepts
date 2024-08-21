package Chp5.Problems;

import java.util.Scanner;

public class RecursionMethod {

    // Q. Find Factorial of number using recursion of methods
    // Take number as user input

    //                          AND

    // Q. Find Factorial of number using recursion of methods
    // Take number as user input

    static int fact = 1;
    static int sum = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RecursionMethod one = new RecursionMethod();
        System.out.print("Enter your number to calculate factorial : ");
        int num1 = sc.nextInt();
        System.out.print("Enter your number to calculate sum : ");
        int num2 = sc.nextInt();
        int a = one.calFact(num1);
        int b = one.calSum(num2);
        System.out.println("Factorial is : " + a);
        System.out.println("Sum is : " + b);
    }
    int calFact(int n) {
        if(n > 1) {
            fact = fact * n;
            calFact(n-1);
        }
        return fact;
    }
    int calSum(int n) {
        if(n > 1) {
            sum = sum + n;
            calSum(n - 1);
        }
        return sum;
    }
}