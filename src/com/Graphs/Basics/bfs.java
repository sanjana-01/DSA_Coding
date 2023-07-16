package com.Graphs.Basics;
import java.util.*;
/*
       BFS (Breadth first search) is a traversal mechanism
        it traverses the whole graph in a breadth-wise fashion. we traverse
        all of its neighbouring Vertices starting from one node and so on go through all the vertices .
        */
public class bfs {
        public static void bfsTravel(int adj[][]){
            Queue<Integer> remvertices=new LinkedList<>();
            boolean vis[] =new boolean[adj.length];
            vis[0]=true;
            remvertices.add(0);

            while(!remvertices.isEmpty()){
                int currvertex=remvertices.poll();
                System.out.print(currvertex + " ");
                for(int i=0;i <adj.length;i++){
                    if(adj[currvertex][i]==1 && vis[i]==false){
                        remvertices.add(i);
                        vis[i]=true;
                    }
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of vertices");
            int v=sc.nextInt();                             //no of vertices
            System.out.println("Enter no of edges");
            int e=sc.nextInt();                             // no of edges
            System.out.println("Enter all the connected vertices");
            int adj[][]=new int[v][v];                      // create adjacency matrix of size no of vertices

            for(int i=0;i<e;i++){
                int v1=sc.nextInt();
                int v2=sc.nextInt();
                adj[v1][v2]=1;
                adj[v2][v1]=1;
            }
            bfsTravel(adj);

        }
    }
