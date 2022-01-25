package DSA.recursion.practise;


// Q1 :- Print numbers from to 1 to n and print n to 1
public class Q1 {
    public static void printAll (int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printAll(n-1);
    }

    public static void printAllRev (int n) {
        if(n==0){
            return;
        }
        printAllRev(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printAllRev(5);
    }
}
