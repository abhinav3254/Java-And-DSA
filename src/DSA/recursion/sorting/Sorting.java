package DSA.recursion.sorting;

import java.util.Arrays;

public class Sorting {
    // Normal ways we do this
    private static void sortBubble(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
//        int[] arr = {2,5,4,6,1,3};
        int[] arr = {4,3,2,1};
        sortBubble(arr);

    }
}
