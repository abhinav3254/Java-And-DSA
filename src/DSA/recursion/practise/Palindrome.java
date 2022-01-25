package DSA.recursion.practise;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(4521));
    }

    private static int sum = 0;
    private static void rev(int n) {
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        rev(n/10);
    }

    private static boolean palindrome(int n){
        rev(n);
        if(n==sum){
            return true;
        }
        return false;
    }
}
