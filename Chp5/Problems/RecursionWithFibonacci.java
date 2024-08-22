package Chp5.Problems;

import java.util.Scanner;

public class RecursionWithFibonacci {
    static int a = 0 , b = 1;
    public static void main(String[] args) {

        // Q. Print Fibonacci number using Recursion Method
        // Take input from user

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        RecursionWithFibonacci one = new RecursionWithFibonacci();
        System.out.println(a);
        System.out.println(b);
        one.calcFibonacci(num);
    }
    void calcFibonacci(int n) {
        if(n > 1) {
            int temp = a;
            a = b;
            b = temp + a;
            System.out.println(b);
            calcFibonacci(n - 1);
        }
    }
}
