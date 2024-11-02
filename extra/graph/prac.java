package extra.graph;

import java.util.*;

public class prac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Graph graph = new Graph();
        System.out.println("enter the numbr of vertex");
        int numVertics = scanner.nextInt();

        System.out.println("enter the vertics by line");
        for (int i = 0; i < numVertics; i++) {
            int v = scanner.nextInt();
            graph.addVertex(v);
        }
        System.out.println("enter the number of edges");
        int numEdges = scanner.nextInt();

        System.out.println("enter the both vertex");
        for (int i = 0; i < numEdges; i++) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            graph.addEdges(v1, v2);
        }

        System.out.println("Graph");
        graph.printGraph();
    }

    static class Graph {
        final Map<Integer, List<Integer>> adjList;

        public Graph() {
            adjList = new HashMap<>();
        }

        public void addVertex(int v) {
            if (!adjList.containsKey(v)) {
                adjList.put(v, new ArrayList<>());
            }
        }

        public void addEdges(int v1, int v2) {
            if (!adjList.containsKey(v1) || !adjList.containsKey(v2)) {
                throw new IllegalArgumentException("vertex doesnot exist in extra.graph");
            }

            if (!adjList.get(v1).contains(v2)) {
                adjList.get(v1).add(v2);
            }
            if (!adjList.get(v2).contains(v1)) {
                adjList.get(v2).add(v1);
            }
        }

        void printGraph() {
            for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
                int vertex = entry.getKey();
                List<Integer> neighbours = entry.getValue();
                System.out.println("Vertex" + vertex + " is connected to: ");
                for (int neighbour : neighbours) {
                    System.out.print(neighbour + " ");
                }
                System.out.println();
            }
        }
    }
}