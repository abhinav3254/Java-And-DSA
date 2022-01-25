package DSA.recursion.practise;

public class CountZeros {
    public static void main(String[] args) {
        int ans = count(2030);
        System.out.println(ans);
    }

    private static int count(int n){
        return helper(n,0);

    }
    private static int helper(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }
}
