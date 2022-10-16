package DSA.gfg.oct2022;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
//        for (int i = 0; i < d; i++) {
//            arrayShift(arr);
//        }
//        System.out.println(Arrays.toString(arr));
        arrayShiftTwo(arr,arr.length,d);
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayShift (int[] arr) {
        int temp = arr[0];
        int len = arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[len-1] = temp;
    }

    public static void arrayShiftTwo (int[] arr , int n,int d) {
        int[] temp = new int[n];
        int k = 0;
        for (int i = d; i < n; i++) {
            temp[k] = arr[i];
            k++;
        }

        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

//        int temp[] = new int[n];
//        int k = 0;
//        for (int i = d; i < n; i++) {
//            temp[k] = arr[i];
//            k++;
//        }
//        for (int i = 0; i < d; i++) {
//            temp[k] = arr[i];
//            k++;
//        }
//        for (int i = 0; i < n; i++) {
//            arr[i] = temp[i];
//        }
    }
}
