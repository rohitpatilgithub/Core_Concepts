package Chp4.Problems;

public class SwapNumbers {
    public static void main(String[] args) {
        // Q. Swap numbers with third variable
        int a = 10;
        int b = 20;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);

        // Q. Swap numbers without third variable
        int num1 = 100;
        int num2 = 20;
        num1 = num2 + num1;
        if(num1 > num2) {
            num2 = num1 - num2;
            num1 = num1 - num2;
        } else {
            num1 = num1 - num2;
            num2 = num1 - num2;
        }
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
    }
}
