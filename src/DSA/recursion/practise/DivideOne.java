package DSA.recursion.practise;

// find the remainder

public class DivideOne {
    public static void main(String[] args) {
        int n = 23;
        int q = 6;
        remainderDivide(n,q);
    }
    private static void remainderDivide(int n, int q) {
        if(n<q) {
            System.out.println(n);
            return;
        }
        remainderDivide(n-q,q);
    }
}
