package DSA.graph.adjacencyList.dfs;

import java.util.LinkedList;
import java.util.Scanner;

public class Two {
    private final LinkedList<Integer>[] adj;
    private final int V;

    public Two (int v) {
        this.V = v;
        this.adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s , int d) {
        adj[s].add(d);
    }

    public void DFS(int vertex) {
        boolean[] already = new boolean[V];
        DFSUtil(vertex,already);
    }

    private void DFSUtil(int vertex, boolean[] already) {
        already[vertex] = true;
        System.out.print(vertex+" ");

        for (int i = 0; i < adj[vertex].size(); i++) {
            int a = adj[vertex].get(i);

            if(!already[a]) {
                DFSUtil(a,already);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nodes:- ");
        int nodes = sc.nextInt();
        System.out.println("Vertex:- ");
        int edges = sc.nextInt();


        Two two = new Two(nodes);
        for (int i = 0; i < edges; i++) {
            System.out.println("source:- ");
            int s = sc.nextInt();
            System.out.println("Destination:-");
            int d = sc.nextInt();
            two.addEdge(s,d);
        }

        System.out.println("DFS Traversal:- ");
        two.DFS(0);
    }
}
