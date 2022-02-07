package DSA.recursion_assignments;

import java.util.Arrays;

public class Q5ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
    public static void reverseString(char[] s) {
        String s1 =new String(s);
        StringBuilder sb = new StringBuilder(s1);
        s1 = sb.reverse().toString();
        for(int i = 0;i<s1.length();i++){
            s[i] = s1.charAt(i);
        }
        System.out.println(Arrays.toString(s));
    }
}
