package DSA.binsearch;

public class BINONE {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int key = 9;
        int ans = binarySearch(arr, key);
        if (ans>0)
        System.out.println("Element found at index "+ans);
        else 
        System.out.println("Element not found");
    }

    public static int binarySearch(int[] arr,int key) {
        int s = 0;
        int e = arr.length-1;
        while(s<=e) {
            int mid = (s+e)/2;
            if(key == arr[mid]) {
                return mid;
            } if (key<arr[mid]) {
                e = mid-1;
            } 
            if (key>arr[mid]) {
                s = mid+1;
            } 
        }
        return -1;
    }
}
