package codechef.START53;

import java.util.Scanner;

public class GreaterAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            float a = sc.nextInt();
            float b = sc.nextInt();
            float c = sc.nextInt();
            a = (a+b)/2;
            if (a>c)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
