package DSA.graph.adjacencyList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class One {
    private int V;
    private LinkedList<Integer>[] adj;
    private Queue<Integer> queue;

    One(int v) {
        this.V = v;
        this.adj = new LinkedList[v];
        this.queue = new LinkedList<>();

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source,int destination) {
        adj[source].add(destination);
    }

    public void BFS(int n) {

        boolean[] nodes = new boolean[V];

        queue.add(n);
        nodes[n] = true;

        while (!queue.isEmpty()) {
            int a = 0;
            n = queue.poll();
            System.out.print(n+" ");

            for (int i = 0; i < adj[n].size(); i++) {
                a = adj[n].get(i);
                if(!nodes[a]) {
                    nodes[a] = true;
                    queue.add(a);
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes");
        int nodes = sc.nextInt();
        System.out.println("Enter number of edges");
        int edges = sc.nextInt();

        One one = new One(nodes);

        for (int i = 0; i < edges; i++) {
            System.out.println("Enter source");
            int s = sc.nextInt();
            System.out.println("Enter destination");
            int d = sc.nextInt();
            one.addEdge(s,d);
        }

        System.out.println("BFS Traversal is :- ");
        one.BFS(0);
    }
}
