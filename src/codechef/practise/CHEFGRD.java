package codechef.practise;

import java.util.Scanner;

public class CHEFGRD {
    static int co = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            n = (n+1)/2;
            int cost = 0;
            findCost(x,y,n,0);
            System.out.println(co);
        }
    }
    public static void findCost (int x , int y , int n , int cost) {
        if (n == x && n == y) {
            co = cost;
            return;
        }
        if (n>x && n>y)
            findCost(x+1,y+1,n,cost+0);
        if (n<x && n<y)
            findCost(x-1,y-1,n,cost+0);
        if (n>x && n==y)
            findCost(x+1,y,n,cost+1);
        if (n==x && n>y)
            findCost(x,y+1,n,cost+1);
        if (n<x && n==y)
            findCost(x-1,y,n,cost+1);
        if (n==x && n<y)
            findCost(x,y-1,n,cost+1);
    }
}
