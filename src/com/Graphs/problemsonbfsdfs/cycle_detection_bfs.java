package com.Graphs.problemsonbfsdfs;
import java.util.*;
// O(N + 2E) + O(N), Where N = Nodes, 2E is for total degrees as we traverse all adjacent nodes.
// In the case of connected components of a graph, it will take another O(N) time.
//
//Space Complexity: O(N) + O(N) ~ O(N), Space for queue data structure and visited array.
public class cycle_detection_bfs {
    private static class Pair{
        int node;
        int parent;
        public Pair(int node,int parent){
            this.node=node;
            this.parent=parent;
        }
    }
    public static boolean detect_bfs(int src, ArrayList<ArrayList<Integer>> adj,boolean[] vis ){
        vis[src]=true;
        Queue<Pair>remvertices = new LinkedList<>();
        remvertices.add(new Pair(src,-1));

        while(!remvertices.isEmpty()){
            int node=remvertices.peek().node;
            int parent=remvertices.peek().parent;
            remvertices.poll();

            for(int adjnode : adj.get(node)){
                if(!vis[adjnode]){
                    vis[adjnode]=true;
                    remvertices.add(new Pair(adjnode,node));

                }
                else if(parent!=adjnode){                           // if it is not coming from the parent of that node and is visited already
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[]=new boolean[V];                                   // for connected components
        for(int i =0;i < V; i++){
            if(!visited[i]){
                if(detect_bfs(i,adj,visited)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        cycle_detection_bfs obj = new cycle_detection_bfs();
        boolean ans = obj.isCycle(4, adj);
        if (ans)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
