package com.Graphs.Toposortproblems;
import java.util.*;
//
public class cycle_Detection_directed_graph_bfs {
        public static boolean topoSort(int V, ArrayList<ArrayList<Integer>> adj)
        {
            int[] indegree=new int[V];               //create the in degree array
            for(int i =0; i <V ;i++){                //fill up the  indegree array
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

            int count=0;
            while(!pendingNodes.isEmpty()){
                int node=pendingNodes.poll();
                count++;                                        //add this node in final ordering array

                for (int adjacentNode : adj.get(node)) {        //node is in your topo sort so please remove it from indegree
                    indegree[adjacentNode]--;
                    if(indegree[adjacentNode]==0){
                        pendingNodes.add(adjacentNode);
                    }
                }
            }

            if(count==V){                                      //means topo sort successfully executed , hence no cycle detected
                return false;
            }
            return true ;

        }
    }
