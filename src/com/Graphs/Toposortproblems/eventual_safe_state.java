package com.Graphs.Toposortproblems;
import java.util.*;

public class eventual_safe_state {
        List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {
            List<List<Integer>> adjRev = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                adjRev.add(new ArrayList<>());
            }
            int indegree[] = new int[V];
            for (int i = 0; i < V; i++) {
                for (int it : adj.get(i)) {
                    adjRev.get(it).add(i);              // get the indegree
                    indegree[i]++;
                }
            }
            Queue<Integer> q = new LinkedList<>();
            List<Integer> safeNodes = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                if (indegree[i] == 0) {         // if indegree is 0 add it to queue
                    q.add(i);
                }
            }
            while (!q.isEmpty()) {
                int node = q.peek();
                q.remove();
                safeNodes.add(node);
                for (int it : adjRev.get(node)) {
                    indegree[it]--;                         // reduce the indegree and if it comes to 0 add it in queue
                    if (indegree[it] == 0) q.add(it);
                }
            }
            Collections.sort(safeNodes);
            return safeNodes;
        }
        public static void main(String[] args) {
            int V = 12;
            List<List<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            adj.get(0).add(1);
            adj.get(1).add(2);
            adj.get(2).add(3);
            adj.get(2).add(4);
            adj.get(3).add(4);
            adj.get(3).add(5);
            adj.get(4).add(6);
            adj.get(5).add(6);
            adj.get(6).add(7);
            adj.get(8).add(1);
            adj.get(8).add(9);
            adj.get(9).add(10);
            adj.get(10).add(8);
            adj.get(11).add(9);

            eventual_safe_state obj = new eventual_safe_state();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);

            for (int node : safeNodes) {
                System.out.print(node + " ");
            }
            System.out.println("");
        }
    }
