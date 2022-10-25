package recursion;

public class Two {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, -8};
        System.out.println("max:- "+max(arr,0,Integer.MIN_VALUE)+" min :- "+min(arr,0,Integer.MAX_VALUE));
    }
    public static int max(int[] arr,int i,int max) {
        if (i>=arr.length)
            return max;
        if(max<arr[i])
            max = arr[i];
        return max(arr, i+1, max);
    }

    public static int min(int[] arr,int i, int min) {
        if(i>=arr.length)
            return min;
        if (min>arr[i])
            min = arr[i];
        return min(arr, i+1, min);
    }
}
