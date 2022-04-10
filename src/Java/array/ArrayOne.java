package Java.array;

public class ArrayOne {
    public static void main(String[] args) {
        int[] arr = {45,23,89,77,34,90,12,45,54,11};
        ArrayOne arrayOne = new ArrayOne();
        System.out.println("Max is:- "+arrayOne.maxElement(arr));
        System.out.println("Min is:- "+arrayOne.minElement(arr));
    }

    public int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i])
                max = arr[i];
        }
        return max;
    }

    public int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min>arr[i])
                min = arr[i];
        }
        return min;
    }
}
