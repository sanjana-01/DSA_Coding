package com.Graphs.problemsonbfsdfs;
import java.util.*;
//O(NxM + NxMx4) ~ O(N x M)
//
//For the worst case, the BFS function will be called for (N x M) nodes,
// and for every node, we are traversing for 4 neighbors, so it will take O(N x M x 4) time.
public class distanceofnearestcellhaaving01 {
        private static class Pair {
            int row;
            int column;
            int distance;

            public Pair(int row, int column, int distance ) {
                this.row = row;
                this.column = column;
                this.distance=distance;
            }
        }
        public  static int[][] nearest(int[][] grid)
        {
            int n =grid.length;
            int m =grid[0].length;

            int[][] visited=new int[n][m];
            int[][] distance =new int[n][m];

            Queue<Pair> pendingOnes=new LinkedList<>();

            for(int i=0;i< n ;i++){
                for(int j=0; j < m;j++){
                    //traverse over the grid and find all the ones
                    if(grid[i][j]==1){
                        pendingOnes.add(new Pair(i,j,0));
                        visited[i][j]=1;
                    }
                    else{
                        //this else part not required
                        visited[i][j]=0;

                    }
                }
            }

            // delta row and delta column
            int drow[] = {-1, 0, +1, 0};
            int dcol[] = {0, 1, 0, -1};

            while(!pendingOnes.isEmpty()){
                int row =pendingOnes.peek().row;
                int col=pendingOnes.peek().column;
                int dist=pendingOnes.peek().distance;
                pendingOnes.poll();

                //mark the current element dist in the dist array
                distance[row][col]=dist;

                // exactly 4 neighbours
                for (int i = 0; i < 4; i++) {
                    int nrow = row + drow[i];
                    int ncol = col + dcol[i];

                    if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
                            visited[nrow][ncol] == 0 ) {
                        visited[nrow][ncol] =1;
                        pendingOnes.add(new Pair(nrow,ncol,dist+1));
                    }
                }
            }
            return distance;
        }

        public static void main(String[] args) {

            int[][] grid=  {{0,1,1,0},{1,1,0,0},{0,0,1,1}};
            int[][] output=nearest(grid);
            int rows=output.length;
            int cols=output[0].length;
            for(int i=0;i<rows;i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(output[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
