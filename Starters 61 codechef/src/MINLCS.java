import java.util.Scanner;

public class MINLCS {
    static char next;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int c=0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (s1.charAt(i)==s2.charAt(j)) {
                        c++;
                        break;
                    }
                }
            }

            System.out.println(c);

        }
    }
}