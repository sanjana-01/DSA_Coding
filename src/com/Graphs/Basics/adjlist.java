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
//    int n = adjMatrix.length;
//    ArrayList<ArrayList<Integer>> adjL=new ArrayList<>();
//        for(int i =0; i < n;i++){
//        //here we are giving  edges between vertices and then filling 2d array both way
//        adjL.add(new ArrayList<Integer>());
//        }
//
//        for(int i =0; i < n ;i++){
//        for(int j=0; j < n ;j++){
//        if(adjMatrix[i][j]==1 && i!=j){
//        adjL.get(i).add(j);
////                    adjL.get(j).add(i);
//        }
//        }
//        }
//
//        //print the Adj list
//        for(int i=0; i < n ;i++){
//        System.out.print(i + " : ->");
//
//        for(int j = 0;j < adjL.get(i).size() ;j++){
//        System.out.print(adjL.get(i).get(j)+ " ");
//        }
//        System.out.println();
//        }
//
//
//        }
//
//public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt(); //no of vertices
//        int e=sc.nextInt(); // no of edges
//
//        int adjMatrix[][]=new int[n][n]; //creating n by n matrix
//
//        for(int i=0;i < e ;i++){
//        //here we are giving  edges between vertices and then filling 2d array both way
//        int v1=sc.nextInt();
//        int v2=sc.nextInt();
//        adjMatrix[v1][v2]=1;
//        adjMatrix[v2][v1]=1;
//        }
//
//
//        //printing the array
//        for(int i=0;i<n;i++){
//        for(int j=0;j<n ;j++){
//        System.out.print(adjMatrix[i][j] + " ");
//        }
//        System.out.println();
//        }
//        System.out.println("*******************");
//
//        adjMatrixToList(adjMatrix);
//
//
//        }