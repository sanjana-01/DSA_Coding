package com.Graphs.Toposortproblems;
import java.util.*;
// check if the first one in the array appears before the second one if yes return true, if not return false
// O(V+E), where V = no. of nodes and E = no. of edges. This is a simple BFS algorithm.
public class course_schedule_1 {
    static boolean findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites)
    {

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();             //Create the graph aka adjacency list from given pre prerequisites list
        for(int i =0; i < n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++){                                            // insert the connections in graph from the prerequisites array
            adj.get(prerequisites.get(i).get(1)).add(prerequisites.get(i).get(0));
        }

        int[] indegree=new int[n];
        for(int i =0; i < n ;i++){                                       //fill up the  indegree array
            for(int adjacentNode : adj.get(i)){
                indegree[adjacentNode]++;
            }
        }

        Queue<Integer> pendingNodes=new LinkedList<>();                  //Now traverse over the array and push the nodes in queue whose indegree is zero
        for(int i =0 ; i < n ;i++){
            if(indegree[i]==0){
                pendingNodes.add(i);
            }
        }


        int[] topo=new int[n];                                           //create an array to store linear ordering
        int i=0;
        while(!pendingNodes.isEmpty()){
            int node=pendingNodes.poll();

            topo[i++]=node;                                              //add this node in final ordering array

            for (int adjacentNode : adj.get(node)) {
                                                                         //node is in your topo sort so remove it from indegree
                indegree[adjacentNode]--;
                if(indegree[adjacentNode]==0){
                    pendingNodes.add(adjacentNode);
                }
            }
        }

        if(topo.length==n){                                             // if there's no cycle it means it is following topo sort
            return true;
        }
        return false;


    }
}
