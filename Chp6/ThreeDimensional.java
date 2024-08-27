package Chp6;

public class ThreeDimensional {
    public static void main(String[] args) {
        // 1. Declaration
        int[][][] a;
        int [][]b[];
        int []c[][];

        // 2. Creation
        a = new int[2][][];
        a[0] = new int[2][];
        a[0][0] = new int[1];
        a[0][1] = new int[2];
        //a[0][0][0] = new int[2]; we cannot expand it more
        a[1] = new int[2][];
        a[1][0] = new int[1];
        a[1][1] = new int[2];

        // Declaration & Creation in single line
        b = new int[2][3][2];

        // 3. Initialization
        a[0][0][0] = 10;
        // a[0][0] = 20; not allowed to store value on the edge

        // Declaration , Creation & Initialization in single line
        int[][][] num = {{{10,20} , {30,40,50,60} , {70,80,90}}};
        System.out.println(num.length);
        System.out.println(num[0].length);
        System.out.println(num[0][0].length);

        // 4. Retrieve
        for(int i = 0 ; i < num.length ; i++) {
            for(int j = 0 ; j < num[i].length ; j++) {
                for(int k = 0 ; k < num[i][j].length ; k++) {
//                    System.out.println("Array ["+ i +"]["+ j +"]["+ k +"] : " + num[i][j][k]);
                    System.out.print(num[i][j][k]+" ");
                }
                System.out.println();
            }
        }
    }
}
