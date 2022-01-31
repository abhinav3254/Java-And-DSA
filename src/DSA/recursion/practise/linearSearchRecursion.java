package DSA.recursion.practise;

import java.util.ArrayList;


public class linearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,6,2,2,8,9,2,2,10,2,10};
        System.out.println(search(arr,2,0).toString());
    }
    private static ArrayList<Integer> list = new ArrayList<>();
    private static ArrayList<Integer> search(int[] arr, int target, int index){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
            return search(arr, target, index+1);
        } else{
            return search(arr, target, index+1);
        }
    }
}
