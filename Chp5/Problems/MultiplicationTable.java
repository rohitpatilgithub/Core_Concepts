package Chp5.Problems;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        
        // Q. Print a multiplication table of a number
        // Take number as user input

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        for(int i = 1 ; i <= 10 ; i++) {
            System.out.println(a + " x " + i + " = " + a * i);
        }
    }
}
