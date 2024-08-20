package Chp5;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Scanner class is from package java.util
        // Scanner class has various methods such as next() , nextInt() , nextFloat(), etc...
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String  name = sc.next();
        System.out.print("Enter your Gender : ");
        char gender = sc.next().charAt(0);
        System.out.print("Enter your Age : ");
        int age = sc.nextInt();
        System.out.println("Your name is : "+name);
        System.out.println("Your name is : "+gender);
        System.out.println("Your name is : "+age);
    }
}
