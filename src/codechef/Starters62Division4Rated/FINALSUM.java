package codechef.Starters62Division4Rated;

import java.util.Scanner;

public class FINALSUM {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-->0) {
//            int n = sc.nextInt();
//            int q = sc.nextInt();
//            int[] arr = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextInt();
//            }
//            int[] qrr = new int[q*2];
//            for (int i = 0; i < qrr.length; i++) {
//                qrr[i] = sc.nextInt();
//            }
//
//            for (int j = 0;j<qrr.length;j=j+2) {
//                int l = qrr[j];
//                int r = qrr[j+1];
//                int c = 0;
//                for (int i = l-1; i < r; i++) {
//                    if(c%2==0) {
//                        arr[i] = arr[i]+1;
//                    } else {
//                        arr[i] = arr[i]-1;
//                    }
//                    c = c+1;
//                }
//            }
//
//            System.out.println(sum(arr));
//        }
//    }
//
    public static int sum (int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int c = 0;
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int d = r-l;
                if (d%2==0) {
                    c++;
                }
            }
            System.out.println(sum(arr)+c);
        }
    }
}
