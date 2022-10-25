package recursion;

import java.util.Arrays;

public class Four {
    public static void main(String[] args) {
        char[] a = {'1','2','3','4'};
        char[] b = new char[a.length];
        System.out.println(Arrays.toString(reverseString(a,b,0,b.length-1)));
    }
    public static char[] reverseString (char[] a, char[] b, int i, int j) {
        if (j<0)
            return b;
        b[j] = a[i];
        return reverseString(a, b, i+1, j-1);
    }
}
