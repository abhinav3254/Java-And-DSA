package DSA.recursion.arraywithrecursion;


//Q statement :- We have to check weather the array is sorted or not
public class ArraySorted {
    public static void main(String[] args) {
        int [] arr = {11,2,31,6,10,15};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr){
        int ans = sortedOrNot(arr,0);
        if(ans !=0){
            return true;
        }else{
            return false;
        }
    }

    private static int sortedOrNot(int[] arr,int i){
        if( i== arr.length-1){
            return i;
        }
        if(arr[i]<arr[i+1]){
            return sortedOrNot(arr,i+1);
        } else{
            return 0;
        }
    }
}
