package DSA.recursion.practise;

public class SumOfDigitsAOne {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sumOf(n));
    }
    public static int sumOf(int n) {
        if(n<10) {
            return n;
        }
        return n%10+sumOf(n/10);
    }
}
