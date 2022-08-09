package DSA.gfg;

//https://practice.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Arrays&sortBy=submissions

public class MinDistance {

    public static void main(String[] args) {
        int[] arr = {6 ,15, 82, 8, 74, 59, 75, 83, 86, 36, 20, 39, 34, 60};
        System.out.println(minDist(arr,arr.length,7,20));
    }

    static int minDist(int a[], int n, int x, int y) {
        // code here
        int count = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == x) {
                count = 0;
            }
            if(count >= 0 && y == a[i]) {
                return count;
            }
            count++;
        }
        return -1;
    }
}
