package DSA.recursion_assignments;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(45632));
    }
    private static int sum(int n) {
        if(n == 0) {
            return 0;
        }
        return n%10+sum(n/10);
    }
}
