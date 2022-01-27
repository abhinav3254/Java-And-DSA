package DSA.recursion.arraywithrecursion;

import java.util.ArrayList;

public class MultipleSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,6,7,4,8,9,4,10};
        add1(arr,4,0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    private static void add1(int[] arr,int item,int position){
        if(position == arr.length){
            return;
        }
        else{
            if(arr[position] == item) {
                list.add(position);
                add1(arr,item,position+1);
            } else{
                add1(arr,item,position+1);
            }
        }
    }
}
