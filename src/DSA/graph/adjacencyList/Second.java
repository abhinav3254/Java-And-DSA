package DSA.graph.adjacencyList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Second {


    private final int V;
    private final LinkedList<Integer> [] adj;

    private final Queue<Integer> queue;

    public Second(int v) {
        this.V = v;
        this.adj = new LinkedList[v];
        this.queue = new LinkedList<>();
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s , int d) {
        adj[s].add(d);
    }

//    BFS Traversal

    public void BFS(int n) {
        boolean[] index = new boolean[V];
        index[n] = true;
        queue.add(n);

        while (queue.size()!=0) {
            n = queue.poll();
            System.out.print(n+" ");

            for (int i = 0; i < adj[n].size(); i++) {
                int a = adj[n].get(i);
                if(!index[a]) {
                    index[a] = true;
                    queue.add(a);
                }
            }
        }
    }

    public void DFS(int n) {
        boolean []already = new boolean[V];
        DFSUtil(n,already);
    }

    private void DFSUtil(int n, boolean[] already) {
        already[n] = true;
        System.out.print(n+" ");

        for (int i = 0; i < adj[n].size(); i++) {
            int a = adj[n].get(i);
            if(!already[a]) {
                already[a] = true;
                DFSUtil(a,already);
            }
        }
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

        second.BFS(0);
        System.out.println();
        second.DFS(0);
    }
}
