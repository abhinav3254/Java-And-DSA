package codechef.practise;

import java.util.Scanner;

public class COVID_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n!=1) {
                if (n%2==0) {
                    n = n/2;
                } else {
                    n = (n+1)/2;
                }
            }
            if (m!=1) {
                if (m%2==0) {
                    m = m/2;
                } else {
                    m = (m+1)/2;
                }
            }

            System.out.println(n*m);

        }
    }
}
