package DSA.recursion.practise;

public class FibonacciOne {
    public static void main(String[] args) {
        System.out.println(findFibo(7));
    }

    protected static int findFibo(int n){
        if(n<2){
            return n;
        }
        return findFibo(n-1)+findFibo(n-2);
    }
}
