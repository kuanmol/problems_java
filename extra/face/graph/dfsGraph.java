package extra.face.graph;

import java.util.LinkedList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Vertex
        int m = in.nextInt(); // Edges

        Graph graph = new Graph(n);
        for (int i = 0; i < m; i++) {
            graph.addEdge(in.nextInt(), in.nextInt());
        }

        graph.dfs(0);

    }

}

class Graph {
    int numVertices;
    LinkedList<Integer>[] adjLists;
    boolean[] visited;


    public Graph(int numVertices) {
        this.numVertices = numVertices;
        visited = new boolean[numVertices];
        adjLists = new LinkedList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjLists[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjLists[src].add(dest);
        adjLists[dest].add(src);
    }

    public void dfs(int v) {
        visited[v] = true;

        System.out.print(v + " ");
        for (int neighbour : this.adjLists[v]) {
            if (!visited[neighbour]) {
                dfs(neighbour);
            }
        }
    }
}