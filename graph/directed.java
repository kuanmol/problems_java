package graph;

import java.util.*;

class DirectedGraph {
    private final Map<Integer, List<Integer>> adjList;

    public DirectedGraph() {
        adjList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        if (!adjList.containsKey(vertex)) {
            adjList.put(vertex, new ArrayList<>());
        }
    }

    public void addEdge(int fromVertex, int toVertex) {
        if (!adjList.containsKey(fromVertex) || !adjList.containsKey(toVertex)) {
            throw new IllegalArgumentException("Vertex does not exist in the graph.");
        }


        List<Integer> outgoingVertices = adjList.get(fromVertex);

        if (!outgoingVertices.contains(toVertex)) {
            outgoingVertices.add(toVertex);
        }
    }


    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            int fromVertex = entry.getKey();
            List<Integer> toVertices = entry.getValue();
            System.out.print("Vertex " + fromVertex + " points to: ");
            for (int toVertex : toVertices) {
                System.out.print(toVertex + " ");
            }
            System.out.println();
        }
    }
}

public class directed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DirectedGraph graph = new DirectedGraph();

        System.out.println("Enter the number of vertices:");
        int numVertices = scanner.nextInt();

        System.out.println("Enter the vertices (one per line):");
        for (int i = 0; i < numVertices; i++) {
            int vertex = scanner.nextInt();
            graph.addVertex(vertex);
        }

        System.out.println("Enter the number of directed edges:");
        int numEdges = scanner.nextInt();

        System.out.println("Enter the directed edges (fromVertex toVertex):");
        for (int i = 0; i < numEdges; i++) {
            int fromVertex = scanner.nextInt();
            int toVertex = scanner.nextInt();
            graph.addEdge(fromVertex, toVertex);
        }

        System.out.println("Directed Graph:");
        graph.printGraph();

        scanner.close();
    }
}
