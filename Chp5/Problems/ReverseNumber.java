package Chp5.Problems;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        // Q. Find reverse of number
        // Take number as user input

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a != 0) {
            int b = a % 10;
            System.out.print(b);
            a = a / 10;
        }
    }
}
