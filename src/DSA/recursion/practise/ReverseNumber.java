package DSA.recursion.practise;

public class ReverseNumber {
    public static void main(String[] args) {
        rev(1234);
        System.out.println(sum1);
    }

    // without use of helper function
    private static int sum1 = 0;
    private static void rev(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum1 = sum1*10+rem;
        rev(n/10);
    }
}
