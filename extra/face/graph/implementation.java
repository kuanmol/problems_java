package extra.face.graph;

import java.util.LinkedList;
import java.util.Scanner;

public class implementation {
    int numVertices;
    LinkedList<Integer>[] adj;

    public implementation(int V) {
        numVertices = V;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();
        implementation graph = new implementation(V);

        System.out.print("Enter the number of edges: ");
        int E = scanner.nextInt();
        System.out.println("Enter edges (src dest):");
        for (int i = 0; i < E; i++) {
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            graph.addEdge(src, dest);
        }

        for (int i = 0; i < graph.numVertices; i++) {
            System.out.println(graph.adj[i]);
        }

        scanner.close();
    }

    public void addEdge(int src, int dest) {
        adj[src].add(dest);
        adj[dest].add(src);
    }
}
