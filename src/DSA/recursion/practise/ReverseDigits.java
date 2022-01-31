package DSA.recursion.practise;

public class ReverseDigits {
    public static void main(String[] args) {
        int ans = rev(1234,0);
        System.out.println(ans);
    }
    private static int rev(int n,int sum){
        if(n==0){
            return sum;
        }
        sum = sum*10+n%10;
        return rev(n/10,sum);
    }
}
