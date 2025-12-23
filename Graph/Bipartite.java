
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
public class Bipartite {
    static class Edge{
        int curr;
        int dest;
        int wt;
        public Edge(int c,int d,int w){
            this.curr=c;
            this.dest=d;
            this.wt=w;
        }
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int col[]=new int[graph.length];
        for(int i=0;i<col.length;i++){
            col[i]=-1; // no color -
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(col[i]==-1){
                q.add(i);
                col[i]=0; // starting color

            while(!q.isEmpty()){
                int curr=q.remove();
                for(int j=0;j<graph[curr].size();j++){
                    Edge e=graph[curr].get(j);
                    if(col[e.dest]==-1){
                        int nextCol=col[curr]==0?1:0;
                        col[e.dest]=nextCol;
                        q.add(e.dest);
                    }
                    else if(col[e.dest]==col[curr]){
                        return false; // not bipartite
                    }
                }

        }

            }
        }
        return true; // bipartite
}

        public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Undirected graph (add both directions)
        graph[0].add(new Edge(0, 1, 1));
        graph[1].add(new Edge(1, 0, 1));

        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 1, 1));

        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 2, 1));

        graph[3].add(new Edge(3, 4, 1));
        graph[4].add(new Edge(4, 3, 1));

        System.out.println(isBipartite(graph));
    }
}
        