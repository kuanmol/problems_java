package graph;

import java.util.LinkedList;
import java.util.Queue;

class Graph {
    int vertices;
    LinkedList<Integer>[] adjList;

    @SuppressWarnings("unchecked")
    Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i)
            adjList[i] = new LinkedList<>();
    }

    void addEdge(int u, int v) {
        adjList[u].add(v);
    }

    void bfs(int startNode) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        visited[startNode] = true;
        q.add(startNode);
        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.println(curr + " ");
            for (int neighbour : adjList[curr]) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
    }

}

class Main {
    public static void main(String[] args) {
        // Number of vertices in the graph
        int vertices = 5;

        // Create a graph
        Graph graph = new Graph(vertices);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);

        // Perform BFS traversal starting from vertex 0
        System.out.print(
                "Breadth First Traversal starting from vertex 0: ");
        graph.bfs(0);
    }
}
