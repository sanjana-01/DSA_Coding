package com.Graphs.problemsonbfsdfs;
import java.util.*;
public class cycle_detection_directed_graph {
    private boolean dfsCheck(int node, ArrayList<ArrayList<Integer>> adj, int[] visited, int[] currentPathVisited) {
        visited[node]=1;
        currentPathVisited[node]=1;

        for(int adjacentNode : adj.get(node)){
            if(visited[adjacentNode]==0){                 //when the node is not visited
                if(dfsCheck(adjacentNode,adj,visited, currentPathVisited)){
                    return true;
                }
            }
            else if (currentPathVisited[adjacentNode]==1){
                return true;
            }
        }
        currentPathVisited[node]=0;                     //while returning back , make current node unvisited in path visited
        return false;

    }


    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] visited=new int[V];
        int[] currentPathVisited=new int[V];

        for(int i =0;i < V; i++){                          //handling multiple components cases
            if(visited[i]==0){
                if(dfsCheck(i,adj,visited, currentPathVisited)){
                    return true;
                }
            }
        }
        return false;

    }


}
