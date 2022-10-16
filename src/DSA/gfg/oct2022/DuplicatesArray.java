package DSA.gfg.oct2022;

import java.util.LinkedList;

public class DuplicatesArray {
    public static void main(String[] args) {
        int[] arr = {0,3,1,2,3,2};
        findDup(arr);
    }
    
    public static void findDup (int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[i] == arr[j]) {
                    list.add(arr[i]);
                }
            }
        }
    }
}
