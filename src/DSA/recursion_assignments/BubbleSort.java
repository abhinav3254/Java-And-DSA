package DSA.recursion_assignments;

import java.util.Arrays;
/*
* 10 89.2
1 2 5 3 6 4 9 8 7 10
98 87 67 78 89 99 100 78 77 65
* ans exp - 0;
* */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 5};
        int[] roll = {1, 2, 5, 3, 6, 4, 9, 8, 7, 10};
        int[] marks = {98, 87, 67, 78, 89, 99, 100, 78, 77, 65};
        float avg = 89.2f;
        int n = 10;
        System.out.println(shouldPunish(roll,marks,n,avg));
    }
    private static void bS(int[] arr , int index) {
        if(index == arr.length-1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i = 0;i<arr.length-1;i++) {
            if(arr[index]>arr[i]) {
                var temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
            bS(arr, index+1);
        }
    }

    private static void bSI(int[] arr) {
        int count = 0;
        for(int i = 0;i<arr.length-1;i++) {
            for(int j = 0;j<arr.length-1;j++) {
                if(arr[j]>arr[j+1]){
                    var temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count = count+1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Total swap required is:- "+count);
    }

    public static int shouldPunish (int roll[], int marks[], int n, double avg)
    {
        int count = 0;
        // your code here
        for(int i = 0;i<marks.length-1;i++) {
            for(int j = 0;j<marks.length-1;j++) {
                if(marks[j]>marks[j+1]){
                    int temp = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = temp;
                    count = count + 1;
                }
            }
        }

        float sum = 0;
        for(int i = 0;i<marks.length;i++){
            sum = sum+marks[i];
        }
        sum = (float) (sum-count)/5;
        System.out.println(sum);
        if(sum>avg){
            return 1;
        } else {
            return 0;
        }
    }
}
