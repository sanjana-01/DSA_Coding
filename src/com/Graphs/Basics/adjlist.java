package com.Graphs.Basics;
import java.util.*;
public class adjlist {
    // Adjacency List representation

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no of vertices");
            int n = sc.nextInt();                                       //no of vertices
            System.out.println("Enter no of edges");
            int e = sc.nextInt();                                       // no of edges

            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<Integer>());
            }
            adj.get(0).add(1);
            adj.get(1).add(0);

            adj.get(1).add(2);
            adj.get(2).add(1);


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < adj.get(i).size(); j++) {
                    System.out.print(adj.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }
