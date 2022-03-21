package DSA.graph.adjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class FIRST {

    private LinkedList<Integer>[] adj;

    FIRST(int capacity) {
        adj = new LinkedList[capacity];

//        Creating ArrayList at every node

        for (int i = 0; i < capacity; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s,int d) {
        adj[s].add(d);
        adj[d].add(s);
    }

    public void printGraph() {
        for (int i = 0; i < adj.length; i++) {
            System.out.print(adj[i]+" --> ");
            for (int j = 0; j < adj[i].size(); j++) {
                System.out.print(adj[i].get(i));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number Of Nodes");
        int nodes = sc.nextInt();
        System.out.println("Number of Edges");
        int edges = sc.nextInt();

        FIRST first = new FIRST(nodes);

        System.out.println("Enter "+edges+" edges");
        for(int i=0;i<edges;i++) {
            System.out.print("Enter Source:- ");
            int s = sc.nextInt();
            System.out.print("Enter Destination:- ");
            int d = sc.nextInt();
            first.addEdge(s,d);
        }
//        first.printGraph();
    }
}
