package Chp4.Problems;

public class LeapYear {
    public static void main(String[] args) {
        // Q. Check whether year is Leap Year or not
        int a = 1700;
        if(a % 4 == 0) {
            if (a % 100 == 0 ) {
                if(a % 400 == 0) {
                    System.out.println("It is a Leap year");
                }
                else {
                    System.out.println("It is Not a leap year");
                }
            }
            else {
                System.out.println("It is a Leap year");
            }
        }
        else {
            System.out.println("It is Not a leap year");
        }

        // Q. Different way to find leap year
        if((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
                System.out.println("It is a Leap year");
        }
        else {
            System.out.println("It is not a leap year");
        }
    }
}
