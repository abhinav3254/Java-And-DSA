package DSA.recursion.practise;

public class ArrayOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,15,6,7,8,9,10};
        boolean ans  = isSorted(arr,0);
        System.out.println(ans);
    }
    private static boolean isSorted(int[] arr,int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]){
            return isSorted(arr,index+1);
        }

        return false;
    }
}
