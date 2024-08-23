package Chp6;

public class LearnArrays {
    public static void main(String[] args) {
        // Array is collection of Same data types / Homogenous data types
        // Array starts from index 0 to n ( We have fixed size of Array )
        // Array is an object , Superclass is Object class
        // Array is stored in Heap memory
        // Array can store multi values with fast execution

        LearnArrays[] multi = new LearnArrays[5]; // You can create and store object in Arrays

        // Note : Ihe elements in array are stored consecutively in memory locations ,
        // thus if we delete one element we need to traverse through out the array which will reduce the performance

        int[] num = {1,2,3,4};
        Integer[] numArray = new Integer[4];
        //numArray = num; // this won't compile
        int a = 10;
        Integer b;
        b = a; // this will compile
        System.out.println(b);
    }
}
