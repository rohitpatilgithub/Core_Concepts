package Chp7;

public class InsertionSort {
    public static void main(String[] args) {
        // We keep element at it's initial position and check further elements
        // If position of next element is also in order then it skips it
        // Later when it finds another element is not in order , it replaces it and swaps
        // This process is lengthy thus we can only implement it on small array elements
        int[] a = {10, 2 , 4 , 3 , 5 ,1};
        int temp,j;
        for(int i = 1 ; i < a.length ; i++) {
            temp = a[i];
            j = i;
            while(j > 0 && a[j-1] > temp) {
                a[j] = a[j-1];
                j = j - 1;
            }
            a[j] = temp;
        }
        for(int cell : a) {
            System.out.print("[" + cell + "] ");
        }
    }
}
