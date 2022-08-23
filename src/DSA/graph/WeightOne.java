package DSA.graph;

import java.util.LinkedList;

public class WeightOne {
    static class Edge {
        private int source;
        private int destination;
        private int weight;

        public Edge (int source , int destination , int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph {
        private int vertices;
        private LinkedList<Edge>[] adj;

        public Graph (int vertices) {
            this.vertices = vertices;
            this.adj = new LinkedList[vertices];

            for (int i = 0; i < vertices; i++) {
                adj[i] = new LinkedList<>();
            }
        }

        public void addEdge (int source , int destination , int weight) {
            Edge edge = new Edge(source, destination, weight);
            adj[source].add(edge);
        }

        public void printGraph () {
            for (int i = 0; i < vertices; i++) {
                LinkedList<Edge> list = adj[i];
                for (int j = 0; j < list.size(); j++) {
                    System.out.println("vertex is "+i+" is connected with "+list.get(j).destination+" and has weight of "+list.get(j).weight);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0,1,4);
        graph.addEdge(0,2,3);
        graph.addEdge(1,3,2);
        graph.addEdge(1,2,5);
        graph.addEdge(2,3,7);
        graph.addEdge(3,4,2);
        graph.addEdge(4,0,4);
        graph.addEdge(4,1,4);
        graph.addEdge(4,5,6);

        graph.printGraph();
    }
}
