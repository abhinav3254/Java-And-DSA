package DSA.recursion.arraywithrecursion;

import java.util.ArrayList;

public class ReturningArrayList {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,4,0,5,6,0,7,8,0,9,10};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(add(arr,0,0,list));
    }
    private static ArrayList<Integer> add(int[] arr,int index,int item,ArrayList<Integer> list){
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == item){
            list.add(index);
        }
        return add(arr,index+1,item,list);
    }
}
