package Chp7;

public class BubbleSort {
    public static void main(String[] args) {
        // Sorting elements in particular hierarchy / order
        // Bubble sort is comparison based Algorithm which compares two adjacent values and swaps them as they needed
        // which will end up sorting values in ascending or descending
        // Sorting rounds it will take is total numbers - 1
        int[] a = {36,19,29,12,5};
        int temp;
        for(int i = 0 ; i < a.length ; i++) { // to count number of rounds
            int flag = 0;                       // using flag cuz if it is already sorted then no to disturb the elements
            for(int j = 0 ; j < a.length - 1 - i; j++) { // to compare adjacent values
                if (a[j]>a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;  // if already sorted it breaks the loop
            }
        }
        for(int i = 0 ; i < a.length ; i++) {
            System.out.print(a[i] + " , ");
        }
    }
}
