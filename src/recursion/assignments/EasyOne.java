package recursion.assignments;

public class EasyOne {
    // Problem Link :- https://www.geeksforgeeks.org/sum-triangle-from-array/
    /*
    *    Input : A = {1, 2, 3, 4, 5}
         Output : [48]
         [20, 28]
         [8, 12, 16]
         [3, 5, 7, 9]
         [1, 2, 3, 4, 5]
    * */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sumUp(arr,arr.length-1));
    }

    public static int sumUp (int[] arr , int s) {
        if (arr.length<=1) {
            return arr[0];
        }
        arr[s] = arr[s-1]+arr[s];
        return sumUp(arr,s+1);
    }
}
