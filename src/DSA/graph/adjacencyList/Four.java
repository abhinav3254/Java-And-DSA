package DSA.graph.adjacencyList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Four {
    private final int V;
    private final LinkedList<Integer>[] adj;
    private final Queue<Integer> queue;

    public Four(int nodes) {
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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Number of Nodes:- ");
        int nodes = Integer.parseInt(br.readLine());
        System.out.println("Number of edges:-");
        int edge = Integer.parseInt(br.readLine());

        Four four = new Four(nodes);

        for (int i = 0; i < edge; i++) {
            System.out.println("Source:- ");
            int source = Integer.parseInt(br.readLine());
            System.out.println("Destination:- ");
            int destination = Integer.parseInt(br.readLine());
            four.addEdge(source,destination);
        }

        System.out.println("BFS Traversal");
        four.BFS(0);
    }
}
