package Chp6;

public class TwoDimensional {
    public static void main(String[] args) {

        // 1. Declaration
        int[][] a;

        int [] b[]; // this is also one type of declaration

        int [][] c ,d[]; // 'c' is 2-D Array & 'd' is 3-D Array
        //int [][] c , []d gives compile time error why? ( Basic_Questions Q8. Chp6 )

        // 2. Creation
        a = new int[2][3];

        // 2 rows 3 columns
        // [0,0][0,1][0,2]
        // [1,0][1,1][1,2]

        // we can call '2-D Matrix array' cuz same no. of rows and column

        b = new int[2][];

        b[0] = new int[3];
        b[1] = new int[2];

        // 2 rows
        // [0,0][0,1][0,2]
        // [1,0][1,1]

        // This type of array is called 'Jagged Array' where no similar no. of rows and columns

        // 3. Initialization

        // For Matrix Array
        a[0][0] = 10;
        a[0][1] = 20;
        a[0][2] = 30;
        a[1][0] = 40;
        a[1][1] = 50;
        a[1][2] = 60;

        // Declare , Create and Initialize in single line

        int[][] nums = {{10,20,30},{40,50,60}};

        // For Jagged Array
        int[][] jagged = new int[2][];
        jagged[0] = new int[4];
        jagged[1] = new int[3];

        jagged[0][1] = 20;
        jagged[1][2] = 50;

        // Declare , Create and Initialize in single line

        int[][] one = {{10,20,30,40},{50,40,60}};

        // 4. Retrieve

        //Prints class of 2-D Array 'one'
        System.out.println("Hash code value 'a' class : " + a);// [[ I@ - hash code value
        //Prints class of 1-D Array 'one[0]'
        System.out.println("Hash code value of class 0th element in 'a' class : " + a[0]); // [ I@ - hash code value // prints class
        System.out.println("To get exact element from 'a' at certain position : " + a[0][0]); // here we get exact element
        System.out.println("Rows / length of 'a' : " + a.length); // length of array 'rows'
        System.out.println("Length of columns from 0th / 1st row in 'a' : " + a[0].length); // length of array 'columns in row0'
        //System.out.println(a[0][0].length); this will give runtime error

        // Another retrieve of Jagged Array

        int[][] two = new int[2][];
        System.out.println(two); // [[I@ - hash code value
        System.out.println(two[0]); // null cuz we have not initialized it yet

        // How to print 2-D Array

        int[][] numberLine = {{10,20,30,40} , {50,60} , {70,80,90}};
        for(int i = 0; i < numberLine.length ; i++) {
            for(int j = 0 ; j < numberLine[i].length ; j++) {
                System.out.println("a[" + i + "][" + j + "] : " + numberLine[i][j]);
            }
        }
    }
}
