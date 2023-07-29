package com.Graphs.problemsonbfsdfs;
import java.util.*;
public class number_of_enclaves {
    private static class Pair {
        int row;
        int col;

        public Pair(int row, int col ) {
            this.row = row;
            this.col = col;
        }
    }
    public static int  numberOfEnclaves(int[][] grid) {
        Queue<Pair> pendingOnes = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {                 //first row,first col,last row and last col
                    if (grid[i][j] == 1) {                                          // if there is 1 add to queue pair and mark it as visited
                        pendingOnes.add(new Pair(i, j));
                        visited[i][j] = 1;
                    }
                }

            }
        }

        int drow[] = {-1, 0, +1, 0};
        int dcol[] = {0, 1, 0, -1};

        while (!pendingOnes.isEmpty()) {
            int row = pendingOnes.peek().row;
            int col = pendingOnes.peek().col;
            pendingOnes.poll();

            for (int i = 0; i < 4; i++) {
                int nrow = row + drow[i];
                int ncol = col + dcol[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
                        visited[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {            // if it's visted and it has the value 1
                                                                                        //   add to queue pair and mark it as visited
                    pendingOnes.add(new Pair(nrow, ncol));
                    visited[nrow][ncol] = 1;

                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && visited[i][j] == 0) {                // count all the unvisited 1s
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[][] grid= {{0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}};

        System.out.println(numberOfEnclaves(grid));
    }
}
