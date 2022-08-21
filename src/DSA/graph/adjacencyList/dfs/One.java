package DSA.graph.adjacencyList.dfs;

import java.util.LinkedList;

/**
 *              0
 *             / \
 *            1   2
 *             \/
 *             3
 *            /\
 *           4  5
 *
 */

public class One {
    private final int V;
    private final LinkedList<Integer>[] adj;

    public One (int v) {
        this.V = v;
        this.adj = new LinkedList[V];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void DFS(int node) {
        boolean[] visited = new boolean[V];
        DFSUtil(node,visited);
    }
    private void DFSUtil(int vertex,boolean[] nodes) {
        nodes[vertex] = true;
        System.out.print(vertex+" ");

        for (int i = 0; i < adj[vertex].size(); i++) {
            int a = adj[vertex].get(i);
            if (!nodes[a]) {
                DFSUtil(a,nodes);
            }
        }
    }

    public void addEdge(int s , int d) {
        adj[s].add(d);
    }

    public static void main(String[] args) {
        One one = new One(6);
        one.addEdge(0,1);
        one.addEdge(0,2);
        one.addEdge(1,3);
        one.addEdge(2,3);
        one.addEdge(3,4);
        one.addEdge(3,5);

        System.out.println("DFS Traversal");
        one.DFS(0);
    }
}
