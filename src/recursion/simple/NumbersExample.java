package recursion.simple;

public class NumbersExample {
    public static void main(String[] args) {
        // Write a code that prints the numbers from
        // 1 2 3 4 5
        number(5);
    }

    static void number (int n) {
        if (n < 1) {
            return;
        }
        number(n-1);
        System.out.print(n+" ");
    }
}
