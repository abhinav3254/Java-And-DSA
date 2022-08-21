package DSA.graph.adjacencyList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Two {

    private final int V;
    private final LinkedList<Integer>[] adj;
    private final Queue<Integer> queue;

    public Two(int nodes) {
        this.V = nodes;
        this.adj = new LinkedList[nodes];
        this.queue = new LinkedList<>();

        for (int i = 0; i < nodes; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source , int destination) {
        adj[source].add(destination);
    }

    public void BFS(int n) {
        boolean nodes[] = new boolean[V];
        queue.add(n);
        nodes[n] = true;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes");
        int nodes = sc.nextInt();
        System.out.println("Enter number of edges");
        int edges = sc.nextInt();

        Two two = new Two(nodes);

        for (int i = 0; i < edges; i++) {
            System.out.print("Source\t");
            int source = sc.nextInt();
            System.out.print("Destination\t");
            int destination = sc.nextInt();
            System.out.println();
            two.addEdge(source,destination);
        }

        System.out.println("BFS Traversal");
        two.BFS(0);
    }
}
