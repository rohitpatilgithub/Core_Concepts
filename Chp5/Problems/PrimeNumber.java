package Chp5.Problems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        // Q. Find Prime number
        // Take input from user

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        int count = 0;
        for ( int i = 1 ; i <= a ; i++ ) {
            if ( a % i == 0 ) {
            count++;
            }
        }
        if(count <= 2) {
            System.out.println("Your number is Prime " + count);
        }
        else {
            System.out.println("Your number is not Prime " + count);
        }

        // Q. Print all Prime numbers from 1 to 100
        System.out.println("Prime numbers from 1 - 100");
        int sum = 0;
        for(int i = 2; i <= 100 ; i++) {
            for ( int j = 1 ; j <= i ; j++) {
                if(i % j == 0) {
                    sum++;
                }
            }
            if(sum <= 2) {
                System.out.print(i + " ");
            }
            sum = 0;
        }
    }
}
