package DSA.recursion.practise;

public class Fibo1 {
    public static void main(String[] args) {
        int ans = fibo(25);
        System.out.println(ans);
    }
    private static int fibo(int n){
        if(n==0 || n == 1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
