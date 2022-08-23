package DSA.graph.adjacencyList.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Two {
    private final int V;
    private final LinkedList<Integer>[] adj;
    private final Queue<Integer> queue;

    Two(int v) {
        this.V = v;
        this.adj = new LinkedList[v];
        this.queue = new LinkedList<>();

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s,int d) {
        adj[s].add(d);
    }
    public static void main(String[] args) {

    }
}
