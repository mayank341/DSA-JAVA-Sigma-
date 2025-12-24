

package Graph2;
import java.util.*;

public class Prims {

    static class Edge {
        int src, dest, wt;
        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            wt = w;
        }
    }

    static class Pair implements Comparable<Pair> {
        int v;
        int cost;

        Pair(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair other) {
            return this.cost - other.cost;
        }
    }

    public static void prims(ArrayList<Edge>[] graph, int src) {
        boolean[] vis = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(src, 0));
        int finalCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();

            if (!vis[curr.v]) {
                vis[curr.v] = true;
                finalCost += curr.cost;

                for (Edge e : graph[curr.v]) {
                    if (!vis[e.dest]) {
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }

        System.out.println("Minimum Spanning Tree Cost = " + finalCost);
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // UNDIRECTED GRAPH (both directions)
        graph[0].add(new Edge(0, 1, 2));
        graph[1].add(new Edge(1, 0, 2));

        graph[0].add(new Edge(0, 3, 6));
        graph[3].add(new Edge(3, 0, 6));

        graph[1].add(new Edge(1, 2, 3));
        graph[2].add(new Edge(2, 1, 3));

        graph[1].add(new Edge(1, 3, 8));
        graph[3].add(new Edge(3, 1, 8));

        graph[1].add(new Edge(1, 4, 5));
        graph[4].add(new Edge(4, 1, 5));

        graph[2].add(new Edge(2, 4, 7));
        graph[4].add(new Edge(4, 2, 7));

        graph[3].add(new Edge(3, 4, 9));
        graph[4].add(new Edge(4, 3, 9));

        prims(graph, 0);
    }
}

