package codechef.START53;

import java.util.Scanner;

//https://www.codechef.com/submit/ODDPAIRS?tab=statement

public class OddPairs {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n = sc.nextInt();
            if (n%2==0) {
                n = (n*n)/2;
            } else {
                n = ((n*n)-1)/2;
            }

            System.out.println(n);
        }
    }
}