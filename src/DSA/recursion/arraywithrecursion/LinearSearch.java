package DSA.recursion.arraywithrecursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(arr,10,0));
    }
    private static int search(int[] arr,int element,int index){
        if(index == arr.length){
            return -1;
        } else{
            if(arr[index]==element){
                return index;
            }
            else{
                return search(arr, element, index+1);
            }
        }
    }
}
