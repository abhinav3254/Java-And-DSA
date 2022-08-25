package DSA.graph;

import java.util.LinkedList;

public class WeightTwo {
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge (int source , int destination , int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph {
        final private int vertices;
        final private LinkedList<Edge>[] adj;

        public Graph (int vertices) {
            this.vertices = vertices;
            this.adj = new LinkedList[vertices];

            for (int i = 0; i < vertices; i++) {
                adj[i] = new LinkedList<>();
            }
        }

        public void addEdge (int source,int destination , int weight) {
            Edge edge = new Edge(source,destination,weight);
            adj[source].add(edge);
        }

        public void printGraph(){
            for (int i = 0; i <vertices ; i++) {
                LinkedList<Edge> list = adj[i];
                for (int j = 0; j <list.size() ; j++) {
                    System.out.println("vertex-" + i + " is connected to " +
                            list.get(j).destination + " with weight " + list.get(j).weight);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0,1,2);
        graph.addEdge(0,2,1);
        graph.addEdge(1,3,5);
        graph.addEdge(2,3,6);

        graph.printGraph();
    }
}
