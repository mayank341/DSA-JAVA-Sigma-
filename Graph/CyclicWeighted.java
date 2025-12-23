import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;


public class CyclicWeighted {
    static class Edge {
        int src, dest, wt;

        public Edge(int s, int d, int w) {
            src = s;
            dest = d;
            wt = w;
        }
    }   
    static void CreateGraph(ArrayList<Edge> [] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        // undirected graph :: 
        graph[0].add(new Edge(0,1,5));
        graph[1].add(new Edge(1,0,5));  
        graph[1].add(new Edge(1,2,1));
        graph[2].add(new Edge(2,1,1));
        graph[1].add(new Edge(1,3,3));
        graph[3].add(new Edge(3,1,3));
        graph[2].add(new Edge(2,4,3));
        graph[4].add(new Edge(4,2,3));
        graph[2].add(new Edge(2,3,1));
        graph[3].add(new Edge(3,2,1));

    }
    static boolean isCycle(ArrayList<Edge>[] graph){
        boolean vis[]=new boolean[graph.length];
        boolean stack[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(isCycleUtil(graph,i,vis,stack)){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean isCycleUtil(ArrayList<Edge>[] graph,int curr,boolean vis[],boolean stack[]){
        vis[curr]=true;
        stack[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            }
            if(!vis[e.dest]){
                if(isCycleUtil(graph,e.dest,vis,stack)){
                    return true;
                }
            }
        }
        stack[curr]=false;
        return false;
    }





    public static void main(String[] args) {
        int V=5;
ArrayList<Edge>[] graph = new ArrayList[V];

        CreateGraph(graph);
        System.out.println(isCycle(graph));
        
    }
    
}
