package com.Graphs.Toposortproblems;
import java.util.*;
public class course_schedule_2 {
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        int n =numCourses;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();         //Create the graph aka adjacency list from given pre prerequisites list
        for(int i =0; i < n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++)
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);

        int[] indegree=new int[n];
        for(int i =0; i < n ;i++){
            for(int adjacentNode : adj.get(i)){
                indegree[adjacentNode]++;
            }
        }

        Queue<Integer> pendingNodes=new LinkedList<>();        //Now traverse over the array and push the nodes in queue whose indegree is zero
        for(int i =0 ; i < n ;i++){
            if(indegree[i]==0){
                pendingNodes.add(i);
            }
        }

        int[] topo=new int[n];                               //create an array to store linear ordering
        int i=0;
        while(!pendingNodes.isEmpty()){
            int node=pendingNodes.poll();

            topo[i++]=node;                                  //add this node in final ordering array

            for (int adjacentNode : adj.get(node)) {
                indegree[adjacentNode]--;
                if(indegree[adjacentNode]==0){
                    pendingNodes.add(adjacentNode);
                }
            }
        }

        if(topo.length==n){                                 // if no cycle return topo
            return topo;
        }
        return new int[]{};

    }
    public static void main(String[] args) {

        int[][] prerequisites ={{1,0},{2,0},{3,1},{3,2}};
        int n=4;
        int[] ans=findOrder(n, prerequisites);
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}
