import java.util.*;

public class Cycledetection {

    static class Edge {
        int src, dest, wt;
        public Edge(int s, int d, int w) {
            src = s;
            dest = d;
            wt = w;
        }
    }

    public static boolean isCycle(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (detectCycleUtil(graph, i, vis, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(
            ArrayList<Edge>[] graph, int curr, boolean[] vis, int parent) {

        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                if (detectCycleUtil(graph, e.dest, vis, curr)) {
                    return true;
                }
            }
            else if (e.dest != parent) {
                return true; // cycle found
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 4, 3));
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        graph[4].add(new Edge(4, 2, 2));

        System.out.println(isCycle(graph));
    }
}
