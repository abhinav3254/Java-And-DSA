package DSA.graph.adjacencyList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Three {
    private final int V;
    private LinkedList<Integer>[] adj;
    private final Queue<Integer> queue;
    Three(int edges) {
        this.V = edges;
        this.adj = new LinkedList[V];
        this.queue = new LinkedList<>();

        for (int i = 0; i < edges; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adj[source].add(destination);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes");
        int nodes = sc.nextInt();
        System.out.println("Enter number of edges");
        int edges = sc.nextInt();

        for (int i = 0; i < edges; i++) {
            System.out.println("Enter source");
            int source = sc.nextInt();
            System.out.println("Enter destination");
            int destination = sc.nextInt();
        }
    }
}
