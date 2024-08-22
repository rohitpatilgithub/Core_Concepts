package Chp5.Problems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        // Q. Print Fibonacci number
        // Take input from user till where you want to print the series

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        // Using while loop

//        int count = 2;
//        while ( count <= n ) {
//            int temp = a;
//            a = b;
//            b = temp + b;
//            count++;
//        }

        // Using for loop

        for(int i = 2 ; i <= n ; i++) {
            int temp = a;
            a = b;
            b = temp + b;
            System.out.println(b);
        }
    }
}
