package codechef.START53;

import java.util.Scanner;

//https://www.codechef.com/submit/ODDPAIRS?tab=statement

public class OddPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            int n = sc.nextInt();

            n = n*(n+1)/2;
            System.out.println(n);
        }
    }
}