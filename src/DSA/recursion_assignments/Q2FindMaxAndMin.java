package DSA.recursion_assignments;

//https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/

public class Q2FindMaxAndMin {
    public static void main(String[] args) {
//        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        int[] arr = {1, 4, 45, 6, 10, -8};
        maxMin(arr,0,arr[0],arr[0]);
    }
    private static void maxMin(int[] arr,int index,int max ,int min) {
        if(arr.length == index){
            System.out.println("MAX VALUE IS:- "+max);
            System.out.println("MIN VALUE IS:- "+min);
            return;
        }
        if(max<arr[index]){
            max = arr[index];
        }
        if(min>arr[index]){
            min = arr[index];
        }
        maxMin(arr, index+1, max, min);
    }
}
