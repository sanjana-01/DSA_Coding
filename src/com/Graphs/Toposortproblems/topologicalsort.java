package com.Graphs.Toposortproblems;
import java.util.*;
// topo sorting as in the nodes whihc are connected to each other , the one which is connected should appear before the other is called
// topological sorting
//node u will always appear before node v if there is a directed edge from node u towards node v(u -> v)
// and is for only DAG

// O(V+E)+O(V), where V = no. of nodes and E = no. of edges. There can be at most V components. So, another O(V) time complexity.
public class topologicalsort {
    private static void dfs(int node, int[] visited, Stack<Integer> stack, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = 1;
        for (int adjacentNode : adj.get(node)) {
            if (visited[adjacentNode] == 0) {                               //when the node is not visited
                dfs(adjacentNode, visited, stack, adj);
            }
        }

        stack.push(node);                                 //at the end when you don't have any call to made , store in stack
    }


    public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] visited = new int[V];

        Stack<Integer> stack = new Stack<>();                  //create the stack to store the ordering
        for (int i = 0; i < V; i++) {
            if (visited[i] == 0) {                              //handling multiple components cases
                dfs(i, visited, stack, adj);
            }
        }
        int[] ans = new int[V];
        int i = 0;
        while (!stack.isEmpty()) {
            ans[i] = stack.peek();
            stack.pop();
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);

        int[] ans = topologicalsort.topoSort(V, adj);
        for (int node : ans) {
            System.out.print(node + " ");
        }
        System.out.println("");

    }
}
