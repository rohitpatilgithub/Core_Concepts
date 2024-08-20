package Chp4.Problems;

public class FindLargeNumber {
    public static void main(String[] args) {
        // Q. Find larger number from two
        int a = 15;
        int b = 20;
        if(a > b) {
            System.out.println("a is greater");
        }
        else {
            System.out.println("b is greater");
        }

        // Q. Find larger number from three
        int a1 = 10;
        int a2 = 20;
        int a3 = 30;
        if(a1 > a2 && a1 > a3) {
            System.out.println("a1 is greater");
        }
        else if(a2 > a1 && a2 > a3) {
            System.out.println("a2 is greater");
        }
        else {
            System.out.println("a3 is greater");
        }

        // Q. Another way to do it
        if(a1 > a2) {
            if(a1 > a3) {
                System.out.println("a1 is greater");
            }
        }
        else if (a2 > a1) {
                if(a2 > a3) {
                    System.out.println("a2 is greater");
                }
                else {
                    System.out.println("a3 is greater");
                }
        }
    }
}
