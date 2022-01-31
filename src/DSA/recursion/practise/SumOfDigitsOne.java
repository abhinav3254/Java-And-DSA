package DSA.recursion.practise;

public class SumOfDigitsOne {
    public static void main(String[] args) {
        int ans = sumOf(1234);
        System.out.println(ans);
    }
    private static int sumOf(int n){
        if(n<1){
            return 0;
        }
        return n%10+sumOf(n/10);
    }
}
