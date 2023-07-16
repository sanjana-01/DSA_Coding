package com.Graphs.Basics;
import java.util.Scanner;
public class adjmatrix {
    //Adjacency matrix representation

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of vertices");
            int n=sc.nextInt();                             //no of vertices
            System.out.println("Enter no of edges");
            int e=sc.nextInt();                             // no of edges

            int adjMatrix[][]=new int[n][n];

            for(int i=0;i <e;i++){
                int v1=sc.nextInt();
                int v2=sc.nextInt();
                adjMatrix[v1][v2]=1;                            // marked as 1 in thr matrix as the nodes are connected
                adjMatrix[v2][v1]=1;
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n ;j++){
                    System.out.print(adjMatrix[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
