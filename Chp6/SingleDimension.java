package Chp6;

public class SingleDimension {
    public static void main(String[] args) {
        // 1. Declaration
        int[] a;

        // 2. Creation
        a = new int[3];

        // Declaration & Creation in single step
        int[] b = new int[2];

        int[] zero = new int[0]; // this will compile
        // int[] neg = new int[-3];  this will compile but won't run

        // 3. Initialization
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        // Declaration , Creation & Initialization in single step
        int[] num = {10,20,30};

        int[] mix = new int[]{10,20,30}; // this works too

        // 4. Retrieve

        System.out.println("First way : ");
        for(int i = 0 ; i < num.length ; i++) {
            System.out.println(num[i]);
        }

        // another way ( enhanced for loop / for each loop )

        System.out.println("Second way : ");
        for (int i : num) {
            System.out.println(i);
        }
    }
}
