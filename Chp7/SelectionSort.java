package Chp7;

public class SelectionSort {
    public static void main(String[] args) {
        // Selection sort is combination of both searching and sorting
        // It searches for minimum element in the array ( for ascending ) from unsorted and placing it in beginning
        // In every iteration we pick a element from unsorted sub Array is picked and moved out to sorted array
        int [] a = {38, 52 , 9 ,18 , 6 , 62 , 13};
        int min ; // sorted one's on a side
        for(int i = 0; i < a.length ; i++) {    // for loop 1 where we will increment initial element
            min = i;    // just considering a min value position
            for(int j = i + 1 ; j < a.length ; j++) {   // for loop 2 where we will increment consecutive elements after ' i ' position
                if(a[j] < a[min]) { // min position is initialized / updated
                    min = j;
                }
            }
            int temp = a[i];    // swapping of elements
            a[i] = a[min];
            a[min] = temp;
        }
        for(int cell : a) { // prints the Array
            System.out.print("[" + cell + "] ");
        }
    }
}
