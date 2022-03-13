package DSA.insertion_sort;


public class SECONDIS {
    public static void main(String[] args) {
        int[] arr = {-23,-9,-45,-1};
        insertionSort(arr);
    }
    public static void insertionSort(int[] arr) {
        for(int i = 0;i<arr.length-1;i++) {
            for(int j = i+1;j>0;j--) {
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }

        for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}