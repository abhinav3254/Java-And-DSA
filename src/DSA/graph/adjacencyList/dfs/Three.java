package DSA.graph.adjacencyList.dfs;

import DSA.graph.adjacencyList.bfs.Two;

import java.util.LinkedList;
import java.util.Queue;

public class Three {
    private final int V;
    private final LinkedList<Integer>[] adj;

    Three(int v) {
        this.V = v;
        this.adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s,int d) {
        adj[s].add(d);
    }

    //DFS Traversal
    public void DFS (int root) {
        boolean[] visited = new boolean[V];
        DFSHelper(root,visited);
    }

    private void DFSHelper (int n , boolean[] visited) {
        visited[n] = true;
        System.out.print(n+" ");

        for (int i = 0; i < adj[n].size(); i++) {
            int a = adj[n].get(i);

            if (!visited[a]) {
                DFSHelper(a,visited);
            }
        }
    }

    public static void main(String[] args) {
        Three three = new Three(6);

        three.addEdge(0,1);
        three.addEdge(0,2);
        three.addEdge(1,3);
        three.addEdge(2,3);
        three.addEdge(3,4);
        three.addEdge(3,5);

        three.DFS(0);

    }
}
