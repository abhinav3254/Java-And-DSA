package DSA.gfg.oct2022;

public class BlockSwap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;

    }

    public static void blockSwap (int[] arr,int d,int n) {
        if (d == 0 || d == n) {
            return;
        }
        int[] A = new int[d-1];
        int[] B = new int[n-d];
    }
}
