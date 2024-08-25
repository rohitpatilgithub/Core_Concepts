package Chp6.Problems;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {

        //Q. Create a 2D Matrix and Add both of them
        // Get input in both Matrix

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no. of rows for first Matrix : ");
        int r = sc.nextInt();
        System.out.print("Enter your no. of columns for first Matrix : ");
        int c = sc.nextInt();

        int[][] a;
        int[][] t;
        a = new int[r][c];
        if(r==c) {
            for(int i = 0 ; i < a.length ; i++) {
                for(int j = 0 ; j < a[i].length ; j++) {
                    System.out.print("Enter number for matrix A : a"+"["+ i +"]+["+ j +"] : ");
                    a[i][j] = sc.nextInt();
                }
            }
            t = new int[c][r];
            for(int i = 0 ; i < a.length ; i++) {
                for(int j = 0 ; j < a[i].length ; j++) {
                    t[i][j] = a[j][i];
                }
            }
            for(int i = 0 ; i < a.length ; i++) {
                for(int j = 0 ; j < a[i].length ; j++) {
                    System.out.println("t["+i+"]["+j+"] : " + t[i][j]);
                }
            }
        }
        else {
            System.out.println("Please re-enter values of column and rows which will be same");
        }
    }
}
