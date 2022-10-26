package codechef.Starters62Division4Rated;

import java.util.Scanner;

public class CHEFSCORE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0 || y%x ==0) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
