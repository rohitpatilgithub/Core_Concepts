package Chp10;

import java.util.ArrayList;

public class MaxMinString {

    // Find char which are repeated multiple times
    // 1. Maximum times repeated
    // 2. Minimum times repeated

    public static void main(String[] args) {

        String a = "Chillax";

        char[] nums = new char[a.length()];
        for(int i = 0 ; i < a.length() ; i++){
            nums[i] = a.charAt(i);
        }

        int[] counts = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++) {
            for(int cell : nums){
                if(nums[i] == cell){
                    counts[i] += 1;
                }
            }
        }

        int largest = 0;
        ArrayList<Integer> large = new ArrayList<>();
        ArrayList<Integer> smallest = new ArrayList<>();

        for(int i = 0 ; i <= counts.length-1 ; i++) {
            if (counts[i] > largest) {
                largest = counts[i];
            }
        }

        System.out.println("Largest : " + largest);
        System.out.println("Smallest : " + 1);

        for(int i = 0 ; i <= counts.length-1 ; i++) {
            if(counts[i] == largest) {
                large.add(i);
            }
            if(counts[i] == 1){
                smallest.add(i);
            }
        }

        System.out.println("Largest : ");
        for(int cells : large){
            System.out.print(nums[cells]+" ");
        }

        System.out.println("\nSmallest : ");
        for(int cells : smallest){
            System.out.print(nums[cells]+" ");
        }
    }
}
