package DSA.recursion.practise;

public class ReverseDigits {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123821));
    }
    private static int rev(int n,int sum){
        if(n==0){
            return sum;
        }
        sum = sum*10+n%10;
        return rev(n/10,sum);
    }

    private static boolean isPalindrome(int n){
        int ans = rev(n,0);
        if(ans == n){
            return true;
        } else{
            return false;
        }
    }
}
