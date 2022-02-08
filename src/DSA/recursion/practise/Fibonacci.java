package DSA.recursion.practise;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("terms");
        int terms = sc.nextInt();
        for(int i=0;i<terms;i++)
            System.out.print(fib(i)+"  ");
        sc.close();
    }
    static int fib(int n) {
        if(n==1||n==0)
            return 1;
        return fib(n-1)+fib(n-2);
    }
}
