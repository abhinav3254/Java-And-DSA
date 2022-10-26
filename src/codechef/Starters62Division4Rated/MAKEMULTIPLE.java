package codechef.Starters62Division4Rated;

import java.util.Scanner;

public class MAKEMULTIPLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = 0;
            for (int i = 0;i<=a;i++) {
                a = a+i;
                b = b+i;

                if (b%a==0) {
                    c++;
                    break;
                }
            }
            if (c!=0) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
