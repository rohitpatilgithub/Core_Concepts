package Chp6.Problems;

public class TraverseArrays {
    public static void main(String[] args) {

        // Traverse 1D Array
        System.out.println("Traversing 1D Array : ");
        int[] a = {10,20,30};
        for(int i = 0 ; i < a.length ; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Traverse 2D Array
        System.out.println("Traversing 2D Array : ");
        int[][] b = {{10,20,30} , {40,50,60}};
        for(int i = 0 ; i < b.length ; i++) {
            for(int j = 0 ; j < b[i].length ; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        // Traverse 3D Array
        System.out.println("Traversing 3D Array : ");
        int[][][] c = {{{10,20,30} , {40,30,50,60} , {70,80,90}}};
        for(int i = 0 ; i < c.length ; i++) {
            for(int j = 0 ; j < c[i].length ; j++) {
                for (int k = 0 ; k < c[i][j].length ; k++) {
                    System.out.print(c[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        // Traverse 2D Array using for each
        System.out.println("Traversing 2D Array using for each : ");
        for(int[] i : b){
            for(int cell : i){
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
