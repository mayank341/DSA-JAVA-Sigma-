import java.util.*;

public class AllPathtSource {

    static class Edge {
        int src, dest, wt;
        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            wt = w;
        }
    }

    public static void allPath(ArrayList<Edge>[] graph, int src, int dest,
                               boolean[] visited, String path) {

        if (src == dest) {
            System.out.println(path + dest);
            return;
        }

        visited[src] = true;

        for (Edge e : graph[src]) {
            if (!visited[e.dest]) {
                allPath(graph, e.dest, dest, visited, path + src + " -> ");
            }
        }

        visited[src] = false; // backtracking
    }

    public static void main(String[] args) {

        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++)
            graph[i] = new ArrayList<>();

        // edges
        graph[0].add(new Edge(0, 3, 1));
        graph[5].add(new Edge(5, 2, 1));
        graph[5].add(new Edge(5, 0, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[4].add(new Edge(4, 1, 1));
        graph[4].add(new Edge(4, 0, 1));

        int source = 5;
        int destination = 1;

        boolean[] visited = new boolean[V];

        System.out.println("All paths from source to destination:");
        allPath(graph, source, destination, visited, "");
    }
}
