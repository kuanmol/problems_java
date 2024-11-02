package extra.face.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class prim {

    static int primsMSTCost(int n, List<Edge>[] adjacencyList) {
        boolean[] visited = new boolean[n];
        PriorityQueue<Edge> minHeap = new PriorityQueue<>();
        int mstCost = 0;

        visitVertex(0, visited, adjacencyList, minHeap);

        while (!minHeap.isEmpty()) {
            Edge edge = minHeap.poll();
            int dest = edge.destination;

            if (visited[dest]) continue;

            mstCost += edge.weight;
            visitVertex(dest, visited, adjacencyList, minHeap);
        }

        return mstCost;
    }

    static void visitVertex(int vertex, boolean[] visited, List<Edge>[] adjacencyList, PriorityQueue<Edge> minHeap) {
        visited[vertex] = true;
        for (Edge edge : adjacencyList[vertex]) {
            if (!visited[edge.destination]) {
                minHeap.add(edge);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Edge>[] adjacencyList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjacencyList[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            adjacencyList[u].add(new Edge(u, v, w));
            adjacencyList[v].add(new Edge(v, u, w));
        }

        int minCost = primsMSTCost(n, adjacencyList);
        System.out.println(minCost);

        scanner.close();
    }

    static class Edge implements Comparable<Edge> {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }
    }
}
