package DSA.recursion_assignments;

import java.util.Arrays;

/*
* Output : [48]
         [20, 28]
         [8, 12, 16]
         [3, 5, 7, 9]
         [1, 2, 3, 4, 5]
* */
public class Q1SumTriangleFromArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        print(A);
    }

    private static void print(int[] a) {
        if(a.length<1) {
            return;
        }
        int[] temp = new int[a.length-1];
        for(int i = 0;i<a.length-1;i++) {
            temp[i] = a[i]+a[i+1];
        }
        print(temp);
        System.out.println(Arrays.toString(a));
    }
}