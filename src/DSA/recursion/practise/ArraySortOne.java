package DSA.recursion.practise;

import java.util.Arrays;

public class ArraySortOne {
    public static void main(String[] args) {
        int[] arr = {2,1,5,4,3};
        int[] arr1;
        arr1 = sortArray(arr,0);
        System.out.println(Arrays.toString(arr1));
    }

    private static int[] sortArray(int[] arr, int index) {
        if(index == arr.length-1){
            return arr;
        }

        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return sortArray(arr,index+1);
    }


//    private static int[] sortArray(int[] arr, int index){
//        if(index == arr.length-1){
//            return arr;
//        }
//
//        if(arr[index]>arr[index+1]){
//            int temp = arr[index];
//            arr[index] = arr[index+1];
//            arr[index+1] = temp;
//        }
//        return sortArray(arr,index+1);
//    }


}
