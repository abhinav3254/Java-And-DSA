package DSA.recursion.practise;


// Qno. 2 Sum of the digits of the number
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(12341234));
    }

    private static int sum(int n) {
        if(n==0){
            return 0;
        }
        return (n%10)+sum(n/10);
    }


}
