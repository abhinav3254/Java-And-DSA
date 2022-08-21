package recursion.simple;

public class FibonacciSeries {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8
        // Basically sum of previous two number
        System.out.println(fib(6));
    }

    static int fib (int n) {
        if (n==0)
            return 0;

        if (n==1)
            return 1;

        return fib(n-1)+fib(n-2);
    }
}
