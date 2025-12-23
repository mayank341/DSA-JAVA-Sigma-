import java.util.*;
public class Typological {
    static class Edge {
    int src,dest,wt;
    public Edge(int s,int d,int w){
        this.src=s;
        this.dest=d;
        this.wt=w;    
    }
    }
    public void topSort(ArrayList<Edge>[]graph){
        boolean vis[]=new boolean[graph.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topSortUtil(graph,i,vis,s); // modified dfs 
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void topSortUtil(ArrayList<Edge>[] graph,int curr,boolean vis[],Stack<Integer> s){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topSortUtil(graph,e.dest,vis,s);
            }
        }
        s.push(curr);
    }
    public static void CreateGraph(ArrayList<Edge>[]graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        // 0-vertes :
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        graph[1].add(new Edge(1,3,1));
        graph[2].add(new Edge(2,3,1));
        graph[3].add(new Edge(3,4,1));

        graph[4].add(new Edge(4,5,1));
    }

   public static void main(String[] args) {
        System.out.println("Typological Sort Implementation");
        int V=6;
        ArrayList<Edge>[]graph =new ArrayList[V];
        CreateGraph(graph);
        Typological t=new Typological();
        t.topSort(graph);
       
    }
    
}
