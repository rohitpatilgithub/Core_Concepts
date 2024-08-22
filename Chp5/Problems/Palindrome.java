package Chp5.Problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        // Q. Check whether your number is Palindrome or not
        // Take input from user

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(temp != 0) {
                int rem = temp % 10;
                rev = rev * 10 + rem;
                temp /= 10;
        }
        System.out.println(rev);
        if(rev == num) {
            System.out.println("It is a Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
