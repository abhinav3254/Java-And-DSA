package recursion.simple;

public class Sum {
    public static void main(String[] args) {
        // Sum of n numbers
        System.out.println(sum(5));
    }

    static int sum (int n) {
        if (n == 0) {
            return 0;
        }

        return n+sum(n-1);
    }
}
