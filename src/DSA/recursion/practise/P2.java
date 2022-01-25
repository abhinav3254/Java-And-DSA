package DSA.recursion.practise;

public class P2 {
    public static void main(String[] args) {
        printInput(5);
    }
    protected static int printInput(int n){
        if(n==1){
            System.out.print(n+" ");
            return n;
        }

        int k = printInput(n-1);
        System.out.print(n+" ");
        return k;
    }
}
