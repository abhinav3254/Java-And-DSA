import java.util.Scanner;

public class ABSTRING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            sc.nextLine();
            String word = sc.nextLine();

            if (n%2!=0) {
                System.out.println("NO");
            } else {

                char[] arr = word.toCharArray();

                char temp;

                int i = 0;
                while (i < arr.length) {
                    int j = i + 1;
                    while (j < arr.length) {
                        if (arr[j] < arr[i]) {

                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                        j += 1;
                    }
                    i += 1;
                }
                int check = 0;
                for (int j = 0; j < arr.length-1; j=j+2) {
                    if (arr[j]==arr[j+1]) {
                        check = check+2;
                    }
                    else {
                        System.out.println("NO");
                        break;
                    }
                }

                if (check == word.length()) {
                    System.out.println("YES");
                }

            }
        }
    }
}
