package com.Graphs.problemsonbfsdfs;
import java.util.*;

//: O(N + 2E) + O(N), Where N = Nodes, 2E is for total degrees as we traverse all adjacent nodes.
// In the case of connected components of a graph, it will take another O(N) time.
//
//Space Complexity: O(N) + O(N) ~ O(N), Space for recursive stack space and visited array.
public class cycle_detection_dfs {
        public static boolean detect_dfs(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
            visited[node] = true;
            for (int adjnode : adj.get(node)) {
                if (!visited[adjnode]) {
                    if (detect_dfs(adjnode, node, adj, visited)) {
                        return true;
                    }
                } else if (parent != adjnode) {
                    return true;
                }
            }
            return false;
        }

        public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
            boolean visited[] = new boolean[V];
            for (int i = 0; i < V; i++) {
                if (!visited[i]) {
                    if (detect_dfs(i, -1, adj, visited)) {
                        return true;
                    }
                }
            }
            return false;
        }


        public static void main(String[] args) {
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < 6; i++) {
                adj.add(new ArrayList<>());
            }
            adj.get(1).add(2);
            adj.get(2).add(1);
            adj.get(2).add(3);
            adj.get(3).add(4);
            adj.get(4).add(1);

            cycle_detection_dfs obj = new cycle_detection_dfs();
            boolean ans = obj.isCycle(6, adj);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }

