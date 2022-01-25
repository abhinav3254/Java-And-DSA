package DSA.recursion.practise;

public class LeetCode1342 {
    public static void main(String[] args) {
        System.out.println(steps(14));
    }

    private static int steps(int n){
        return helper(n,0);
    }

    private static int helper(int n, int count) {
        if(n==0){
            return count;
        }
        if((n&1)==0){
            return helper(n/2,count+1);
        }
        return helper(n-1,count+1);
    }
}
