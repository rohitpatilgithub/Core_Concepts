package Chp5.Problems;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        // Q. Reverse a string
        // Take input of String

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String name = sc.next();
        int a = name.length();
        String result = "";
        for(int i = a-1 ; i >= 0 ; i--) {
            result = result + name.charAt(i);
        }
        System.out.println(result);
    }
}
