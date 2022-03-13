package DSA.LinearSearch;

public class FIRSTLS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int key = 0;
        System.out.println(linearSearch(arr, key)+" is index position");
    }

    public static int linearSearch(int[] arr,int key) {
        for(int i = 0;i<arr.length-1;i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
