package recursion.simple;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int key = search(arr,0,arr.length,5);
        System.out.println(key);
    }

    public static int search (int[] arr,int s,int e,int target) {
        if(s>e) {
            return -1;
        }
        int m = (s+e)/2;

        if (target == arr[m]) {
            return m;
        }

        if (target<e) {
            return search(arr,s,m-1,target);
        }

        return search(arr, m+1, e, target);
    }
}
