package codechef.practise;

import java.util.Scanner;

public class carTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            if (n<300) {
                System.out.println(300*10);
            } else {
                System.out.println(n*10);
            }
        }
    }
}
