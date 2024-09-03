package graph;

import java.util.*;

public class unidirected {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Graph graph = new Graph();

        System.out.println("Enter the number of vertices:");
        int numVertices = scanner.nextInt();

        System.out.println("Enter the vertices (one per line):");
        for (int i = 0; i < numVertices; i++) {
            int vertex = scanner.nextInt();
            graph.addVertex(vertex);
        }

        System.out.println("Enter the number of edges:");
        int numEdges = scanner.nextInt();

        System.out.println("Enter the edges (vertex1 vertex2):");
        for (int i = 0; i < numEdges; i++) {
            int vertex1 = scanner.nextInt();
            int vertex2 = scanner.nextInt();
            graph.addEdge(vertex1, vertex2);
        }

        System.out.println("Graph:");
        graph.printGraph();

        scanner.close();
    }

    static class Graph {
        private final Map<Integer, List<Integer>> adjList;

        public Graph() {
            adjList = new HashMap<>();
        }

        public void addVertex(int vertex) {
            if (!adjList.containsKey(vertex)) {
                adjList.put(vertex, new ArrayList<>());

            }
        }

        public void addEdge(int vertex1, int vertex2) {
            if (!adjList.containsKey(vertex1) || !adjList.containsKey(vertex2)) {
                throw new IllegalArgumentException("Vertex does not exist in the graph.");
            }

            // Add vertex2 to the adjacency list of vertex1
            if (!adjList.get(vertex1).contains(vertex2)) {
                adjList.get(vertex1).add(vertex2);
            }

            // Add vertex1 to the adjacency list of vertex2
            if (!adjList.get(vertex2).contains(vertex1)) {
                adjList.get(vertex2).add(vertex1);
            }
        }


        public void printGraph() {
            for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
                int vertex = entry.getKey();
                List<Integer> neighbors = entry.getValue();
                System.out.print("Vertex " + vertex + " is connected to: ");
                for (int neighbor : neighbors) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }
    }
}
