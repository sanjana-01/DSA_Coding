package com.Graphs.Toposortproblems;
import java.util.*;
// TC - O(V+E), where V = no. of nodes and E = no. of edges. This is a simple BFS algorithm.
/*Approach  for Kahn's Algo

    1. Topo sort is only valid or DAG (Directed Acyclic Graph)
    2.As we are using BFS , so we are having queue
    3.Here we will be using a indegree array , indegree means number of incoming edges to a node
    4.So first step is fill up the indegree arr for every node.
    5.insert all nodes with indegree 0 , in queue ( Need Proof - here there will be atleast one node whose
    indegree will be zero in DAG).
    6.take out now one by one from queue , and suppose a node A is picked , then place A in your final
    ordering list and also to whatever A is connected to or we can its going to , remove those links
    mean to say all those adjacent to A , decrease their indegree by 1 .
    7 .Now check after decreasing that adjacent indegree , if their indegree is zero then , then place that adjacent node
    in queue as we decided in step 5 .
    8. As you are  polling nodes from queue and keep add them in your final ordering list
    9.Keep repeating steps until queue is empty , oce empty you will be having your one of the  topo sort order

    * */
// O(V+E), where V = no. of nodes and E = no. of edges. This is a simple BFS algorithm.
public class kahn_algo_toposort {
        public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
        {
            int[] indegree=new int[V];                   //create the in degree array
            for(int i =0; i <V ;i++){                      //fill up the  indegree array
                for(int adjacentNode : adj.get(i)){
                    indegree[adjacentNode]++;
                }
            }

            Queue<Integer> pendingNodes=new LinkedList<>();      //Now traverse over the array and push the nodes in queue whose indegree is zero
            for(int i =0 ; i < V ;i++){
                if(indegree[i]==0){
                    pendingNodes.add(i);
                }
            }

            int[] topo=new int[V];
            int i=0;
            while(!pendingNodes.isEmpty()){
                int node=pendingNodes.poll();
                topo[i++]=node;                                      //add this node in final ordering array

                for (int adjacentNode : adj.get(node)) {             //node is in your topo sort so remove it from indegree
                    indegree[adjacentNode]--;
                    if(indegree[adjacentNode]==0){
                        pendingNodes.add(adjacentNode);
                    }
                }
            }
            return topo;
        }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);

        int[] ans = kahn_algo_toposort.topoSort(V, adj);
        for (int node : ans)
            System.out.print(node + " ");
    }
}
