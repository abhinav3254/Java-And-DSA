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

    public void BFS(int n) {
        boolean nodes[] = new boolean[V];
        nodes[n] = true;
        queue.add(n);

        while (!queue.isEmpty()) {
            n = queue.poll();
            System.out.print(n+" ");

            for (int i = 0; i < adj[n].size(); i++) {
                int a = adj[n].get(i);
                if(!nodes[a]){
                    queue.add(a);
                    nodes[a]=true;
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

        Three three = new Three(nodes);

        for (int i = 0; i < edges; i++) {
            System.out.println("Enter source");
            int source = sc.nextInt();
            System.out.println("Enter destination");
            int destination = sc.nextInt();
            three.addEdge(source,destination);
        }

        System.out.println("BFS Traversal");
        three.BFS(0); // root node is 0
    }
}
