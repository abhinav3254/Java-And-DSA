package DSA.graph.adjacencyList;

import java.util.LinkedList;
import java.util.Scanner;

public class Second {

    private final LinkedList<Integer> [] adj;

    public Second(int v) {
        this.adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s , int d) {
        adj[s].add(d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertex");
        int v = sc.nextInt();
        System.out.println("Enter the number of edges");
        int e = sc.nextInt();
        System.out.println("Enter the "+e+" edges");
        Second second = new Second(v);
        for (int i = 0; i < e; i++) {
            System.out.print("Enter source");
            int s = sc.nextInt();
            System.out.print("Enter destination");
            int d = sc.nextInt();

            second.addEdge(s, d);
        }
    }
}
