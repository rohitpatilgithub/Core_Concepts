package Chp6;

public class AnonymousArrays {
    public static void main(String[] args) {
        // Anonymous Array is a type of array which has no name and its purpose is to create and use instantly
        // It is directly created and initialized in single line and use for once
        AnonymousArrays.sum(new int[][]{{10,20,30},{40,50,60}});
    }
    static void sum(int[][] no) {
        int total = 0;
        for(int[] i : no) {
            for(int cell : i){
                total = total + cell;
            }
        }
        System.out.println("Total is : " + total);
    }
}
