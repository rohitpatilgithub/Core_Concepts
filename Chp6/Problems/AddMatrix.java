package Chp6.Problems;

import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {

        //Q. Create a 2D Matrix and Add both of them
        // Get input in both Matrix

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no. of rows for first Matrix : ");
        int r1 = sc.nextInt();
        System.out.print("Enter your no. of columns for first Matrix : ");
        int c1 = sc.nextInt();
        System.out.print("Enter your no. of rows for second Matrix : ");
        int r2 = sc.nextInt();
        System.out.print("Enter your no. of columns for second Matrix : ");
        int c2 = sc.nextInt();

        int[][] a;
        int[][] b;
        int[][] c;
        if(r1 == r2 && c1 == c2) {
            a = new int[r1][c1];
            b = new int[r2][c2];
            c = new int[r1][c1];
            for(int i = 0 ; i < a.length ; i++) {
                for(int j = 0 ; j < a[i].length ; j++) {
                    System.out.print("Enter number for matrix A : a"+"["+ i +"]+["+ j +"] : ");
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i = 0 ; i < b.length ; i++) {
                for(int j = 0 ; j < b[i].length ; j++) {
                    System.out.print("Enter number for matrix B : b"+"["+ i +"]+["+ j +"] : ");
                    b[i][j] = sc.nextInt();
                }
            }
            for(int i = 0 ; i < a.length ; i++) {
                for(int j = 0 ; j < a[i].length ; j++) {
                    c[i][j] = a[i][j]+b[i][j];
                    System.out.println("Result : ");
                    System.out.println("c["+ i +"]["+ j +"] : " + c[i][j]);
                }
            }
        }
    }
}
