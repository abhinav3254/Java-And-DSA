import java.util.Scanner;

public class ODDSUMPAIR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int count = 0;

            if ((a+b)%2!=0) {
                count = count+1;
            } else if ((b+c)%2!=0) {
                count = count+1;
            } else if ((a+c)%2!=0) {
                count = count+1;
            }

            if (count>0) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
