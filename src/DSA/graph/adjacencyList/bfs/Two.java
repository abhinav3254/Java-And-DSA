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

    //BFS Traversal

    public void BFS (int root) {
        boolean[] visited = new boolean[V];
        queue.add(root);

        while (!queue.isEmpty()) {
            root = queue.poll();
            System.out.print(root+" ");

            for (int i = 0; i < adj[root].size(); i++) {
                int a = adj[root].get(i);
                if(!visited[a]) {
                    queue.add(a);
                    visited[a] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Two two = new Two(6);

        two.addEdge(0,1);
        two.addEdge(0,2);
        two.addEdge(1,3);
        two.addEdge(2,3);
        two.addEdge(3,4);
        two.addEdge(3,5);

        two.BFS(0);
    }
}
