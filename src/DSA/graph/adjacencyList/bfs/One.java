package DSA.graph.adjacencyList.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class One {
    private final int V;
    private final LinkedList<Integer>[] adj;
    private final Queue<Integer> queue;

    public One(int nodes) {
        this.V = nodes;
        this.adj = new LinkedList[nodes];
        this.queue = new LinkedList<>();

        for (int i = 0; i < nodes; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void BFS(int n) {
        boolean[] nodes = new boolean[V];
        nodes[n] = true;
        queue.add(n);

        while (!queue.isEmpty()) {
            n = queue.poll();
            System.out.print(n+" ");

            for (int i = 0; i < adj[n].size(); i++) {
                int a = adj[n].get(i);
                if(!nodes[a]) {
                    queue.add(a);
                    nodes[a] = true;
                }
            }
        }
    }

    /*
    * public void BFS(int n) {
        boolean[] nodes = new boolean[V];
        nodes[n] = true;
        queue.add(n);

        while (!queue.isEmpty()) {
            n = queue.poll();
            System.out.print(n+" ");

            for (int i = 0; i < adj[n].size(); i++) {
                int a = adj[n].get(i);
                if(!nodes[a]) {
                    queue.add(a);
                    nodes[a] = true;
                }
            }
        }
    }
    * */

    public void addEdge(int source , int destination) {
        adj[source].add(destination);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of nodes:- ");
        int nodes = sc.nextInt();
        System.out.println("Number of edges:- ");
        int edges = sc.nextInt();

        One one = new One(nodes);

        for (int i = 0; i < edges; i++) {
            System.out.println("source:- ");
            int source = sc.nextInt();
            System.out.println("Destination:- ");
            int destination = sc.nextInt();
            one.addEdge(source,destination);
        }

        System.out.println("BFS Traversal");
        one.BFS(0);
    }
}
