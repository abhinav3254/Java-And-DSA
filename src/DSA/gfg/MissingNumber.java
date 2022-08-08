package DSA.gfg;

//https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&difficulty[]=0&status[]=unsolved&sortBy=submissions

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {6,1,2,8,3,4,7,10,5};
        int n = 10;

        System.out.println(missingNumber(arr,n));
    }

    static int missingNumber(int array[], int n) {
        // Your Code Here
        int sum = (n*(n+1))/2;
        int sumOfArr = 0;

        for (int i = 0; i < array.length; i++) {
            sumOfArr = sumOfArr+array[i];
        }
        return sum-sumOfArr;
    }
}
