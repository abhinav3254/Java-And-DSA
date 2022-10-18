package codechef.LP1TO201;

import java.util.Scanner;

public class HOOPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int i = 1;
            while (i != n) {
                i++;
                n--;
            }
            System.out.println(i);
        }
    }
}
