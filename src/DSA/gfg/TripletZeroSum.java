package DSA.gfg;

import java.util.Arrays;

public class TripletZeroSum {
    public static void main(String[] args) {
        int[] arr = {60 ,-65 ,5 ,-21 ,8 ,93};
        System.out.println();
        boolean ans = findTriplets(arr,arr.length);

        System.out.println(ans);
    }

    public static boolean findTriplets (int[] arr, int n) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {
            int x = arr[i];
            int l = i+1;
            int r = arr.length-1;

            while (l<r) {
                if (x+arr[l]+arr[r] == 0) {
                    return true;
                }
                else if (x+arr[l]+arr[r] < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return false;
    }
}
