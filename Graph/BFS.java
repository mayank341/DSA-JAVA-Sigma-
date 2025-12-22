import java.util.*;
import java.util.LinkedList;

public class BFS {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void bfs(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[graph.length];

        q.add(0); // start from node 0

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!visit[curr]) {
                System.out.print(curr + " ");
                visit[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    if (!visit[e.dest]) {
                        q.add(e.dest);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // edges
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

        System.out.print("BFS Traversal: ");
        bfs(graph);
    }
}
