package com.Graphs.problemsonbfsdfs;
import java.util.*;
/*/*You are given an m x n grid where each cell can have one of three values:

        0 representing an empty cell,
        1 representing a fresh orange, or
        2 representing a rotten orange.
        Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.
        Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

        Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
        Output: 4


        // O(N*N)*4  as 4 directions worst case
 */
public class rotten_oranges {
    private static class Pair {
        int row;
        int column;
        int time;

        public Pair(int row, int column, int time ) {
            this.row = row;
            this.column = column;
            this.time=time;
        }
    }

    private static int rottenOrange(int[][] grid) {
        //take the grid sizes
        int n = grid.length;
        int m =grid[0].length;

        int countFresh=0;

        //now get all the rotten oranges and put them in queue
        Queue<Pair> pendingOranges=new LinkedList<>();
        int[][] visited=new int[n][m];
        for(int i=0; i < n; i++){
            for(int j=0; j < m ; j++){
                //now if index is rotten , please pick them and add with the current time
                if(grid[i][j]==2){
                    pendingOranges.add(new Pair(i,j,0));
                    visited[i][j]=2;
                }
                if(grid[i][j]==1){                //track all fresh oranges
                    countFresh++;
                }
            }
        }
        int time =0;
        int drow[] = {-1, 0, +1, 0};                // row+1,row-1,col+1,col-1
        int dcol[] = {0, 1, 0, -1};
        int count=0;

        while(!pendingOranges.isEmpty()){
            int r =pendingOranges.peek().row;
            int c=pendingOranges.peek().column;
            int t=pendingOranges.peek().time;
            pendingOranges.poll();
            time = t ;

            for (int i = 0; i < 4; i++) {                //now lets visit  all the 4neighbours
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                // check for valid coordinates and
                // then for unvisited fresh orange
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
                        visited[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                    // push in queue with timer increased
                    pendingOranges.add(new Pair(nrow, ncol, t + 1));
                    visited[nrow][ncol] = 2;        // mark as rotten
                    count++;                         //increment the count of oranges pushed in queue
                }
            }
        }

        if(count!=countFresh){                       // check if  fresh oranges found in grid are equal to
            return -1;
        }
        return time;
    }

    public static void main(String[] args) {
        int[][] arr={{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(rottenOrange(arr));
    }
}
