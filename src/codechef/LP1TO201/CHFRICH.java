package codechef.LP1TO201;

import java.util.Scanner;

public class CHFRICH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int count = 0;
            while (a<b) {
                a = a+x;
                count++;
            }
            System.out.println(count);
        }
    }
}
