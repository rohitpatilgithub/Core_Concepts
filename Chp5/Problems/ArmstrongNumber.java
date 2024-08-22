package Chp5.Problems;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        // Q. Check whether number entered is Armstrong number or not
        // Take input from user

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int armstrong = 0;
        int length = 0;

        while(temp != 0) {
            temp /= 10;
            length++;
        }

        temp = num;

        while(temp != 0) {
            int rem = temp % 10;
            int cube = 1;
            for(int i = 1; i <= length ; i++) {
                cube = cube * rem;
            }
            armstrong = rem + armstrong;
            temp/= 10;
        }


        if(armstrong == num) {
            System.out.println("It is an Armstrong Number");
        }
        else {
            System.out.println("No it is not an Armstrong Number");
        }
    }
}
