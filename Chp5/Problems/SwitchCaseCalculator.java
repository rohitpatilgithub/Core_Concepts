package Chp5.Problems;

import java.util.Scanner;

public class SwitchCaseCalculator {
    public static void main(String[] args) {

        // Q. Create a simple calculator using switch-case
        // Take input of two numbers and symbol to perform calculation

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int b = sc.nextInt();
        int result = 0;
        System.out.print("Enter your symbol for operation : ");
        char symbol = sc.next().charAt(0);
        switch (symbol){
            case '+' :
                result = a + b;
                break;
            case '-' :
                result = a - b;
                break;
            case '*' :
                result = a * b;
                break;
            case '/' :
                result = a / b;
                break;
            default:
                System.out.println("Error : Enter symbol to perform the operation");
        }
        System.out.println(result);
    }
}
