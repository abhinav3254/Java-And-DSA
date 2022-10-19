import java.util.Scanner;

public class DIFFCONSEC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            String newString = "";
            int count = 0;

            for (int i = 0; i < n-1 ; i++) {
                if(s.charAt(i)==s.charAt(i+1)) {
                    count = count+1;
                    if (s.charAt(i)=='0') {
                        newString = newString+s.charAt(i)+"1";
                    } else {
                        newString = newString+s.charAt(i)+"0";
                    }
                }  else {
                    newString = newString+s.charAt(i);
                }
            }
            System.out.println(count);
        }
    }
}
