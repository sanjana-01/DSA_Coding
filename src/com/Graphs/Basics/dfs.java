package com.Graphs.Basics;
import java.util.*;
public class dfs {
    public static void dfsTravel(int adj[][], int currVertex, boolean visited[]) {
        visited[currVertex] = true;
        System.out.println(currVertex + " ");
        for (int i = 0; i < adj.length; i++) {
            if (adj[currVertex][i] == 1 && visited[i] == false) {
                dfsTravel(adj, i, visited);
            }
        }
    }

    public static void dfsTravel(int adj[][]) {
        boolean visited[] = new boolean[adj.length];
        dfsTravel(adj, 0, visited);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter no of vertices");
        int n = sc.nextInt();                                 //no of vertices
        System.out.println(" Enter no of edges");
        int e = sc.nextInt();                                 // no of edges
        int adj[][] = new int[n][n];

        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adj[v1][v2] = 1;
            adj[v2][v1] = 1;
        }

        dfsTravel(adj);
    }
}