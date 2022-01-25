package DSA.recursion.practise;

public class P1 {
    public static void main(String[] args) {
        int ans = sum(2);
        System.out.println(ans);
    }
    protected static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
