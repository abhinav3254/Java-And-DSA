package recursion;

public class CheckConfig {
    public static void main(String[] args) {
        rec(10);
    }
    public static int rec(int n) {
        if (n==0)
            return 1;
        System.out.println(n);
        return rec(n-1);
    }
}
