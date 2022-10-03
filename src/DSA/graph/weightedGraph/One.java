package DSA.graph.weightedGraph;

import DSA.graph.WeightedGraph;

import java.util.LinkedList;

public class One {

    static class WeightedGraph {
        private final int source;
        private final int destination;
        private final int weight;

        WeightedGraph(int source , int destination , int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph {
        private final int V;
        private final LinkedList<WeightedGraph>[] adj;
        Graph(int v) {
            this.V = v;
            this.adj = new LinkedList[v];

            for (int i = 0; i < v; i++) {
                adj[i] = new LinkedList<>();
            }
        }

        public void addEdge(int source, int destination , int weight) {
            WeightedGraph weightedGraph = new WeightedGraph(source,destination,weight);
            adj[source].add(weightedGraph);
        }

        public void printGraph() {
            for (int i = 0; i < V; i++) {
                LinkedList<WeightedGraph> list = adj[i];
                for (int j = 0; j < list.size(); j++) {
                    System.out.println("vertex-" + i + " is connected to " +
                            list.get(j).destination + " with weight " + list.get(j).weight);
                }
            }
        }

        public static void main(String[] args) {
            int vertices = 6;
            Graph graph = new Graph(vertices);
            graph.addEdge(0, 1, 4);
            graph.addEdge(0, 2, 3);
            graph.addEdge(1, 3, 2);
            graph.addEdge(1, 2, 5);
            graph.addEdge(2, 3, 7);
            graph.addEdge(3, 4, 2);
            graph.addEdge(4, 0, 4);
            graph.addEdge(4, 1, 4);
            graph.addEdge(4, 5, 6);
            graph.printGraph();
        }
    }
}
