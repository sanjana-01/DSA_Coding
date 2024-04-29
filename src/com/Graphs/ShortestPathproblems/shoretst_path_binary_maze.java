package com.Graphs.ShortestPathproblems;

import java.util.LinkedList;
import java.util.Queue;
/*Given a n * m matrix grid where each element can either be 0 or 1. You need to find the shortest distance between a given source cell to a destination cell. The path can only be created out of a cell if its value is 1.

        If the path is not possible between source cell and destination cell, then return -1.

        Note : You can move into an adjacent cell if that adjacent cell is filled with element 1. Two cells are adjacent if they share a side. In other words, you can move in one of the four directions, Up, Down, Left and Right. The source and destination cell are based on the zero based indexing.

        Example 1:

        Input:

        grid[][] = {{1, 1, 1, 1},
        {1, 1, 0, 1},
        {1, 1, 1, 1},
        {1, 1, 0, 0},
        {1, 0, 0, 1}}
        source = {0, 1}
        destination = {2, 2}
        Output:
        3

        */
public class shoretst_path_binary_maze {

        public static class tuple {
            int distance, row , column;
            tuple(int distance, int row, int column) {
                this.distance = distance;
                this.row = row;
                this.column = column;
            }
        }

        public static int shortestPathBinaryMatrix(int[][] grid) {
            int[] source ={0,0};
            int[] destination={grid.length-1,grid.length-1};

            // Edge Case: if the source is only the destination.
            if(source[0] == destination[0] &&
                    source[1] == destination[1]) return 0;

            // Create a queue for storing cells with their distances from source
            // in the form {dist,{cell coordinates pair}}.

            Queue<tuple> q = new LinkedList<>();
            int n = grid.length;
            int m = grid[0].length;

            // Create a distance matrix with initially all the cells marked as
            // unvisited and the source cell as 0.
            int[][] dist = new int[n][m];
            for(int i = 0;i<n;i++) {
                for(int j =0;j<m;j++) {
                    dist[i][j] = (int)(1e9);
                }
            }
            dist[source[0]][source[1]] = 0;
            q.add(new tuple(0, source[0], source[1]));

            // The following delta rows and delta columns array are created such that
            // each index represents each adjacent node that a cell may have
            // in a direction.

            // Iterate through the maze by popping the elements out of the queue
            // and pushing whenever a shorter distance to a cell is found.

            while(!q.isEmpty()) {
                tuple it = q.peek();
                q.remove();
                int dis = it.distance;
                int r = it.row;
                int c = it.column;

                for(int delrow=-1;  delrow<=1; delrow++){
                    for(int delcol=-1; delcol<=1;delcol++){
                        //neighbour rows and cols
                        int newr=r + delrow;
                        int newc=c + delcol;

                        // Checking the validity of the cell and updating if dist is shorter.
                        if(newr >= 0 && newr < n && newc >= 0 && newc < m
                                && grid[newr][newc] == 0 && dis + 1 < dist[newr][newc]) {
                            dist[newr][newc] = 1 + dis;

                            // Return the distance until the point when
                            // we encounter the destination cell.
                            if(newr == destination[0] &&
                                    newc == destination[1]) return dis + 1;
                            q.add(new tuple(1+dis, newr, newc));
                        }
                    }
                }
            }
            // If no path is found from source to destination.
            return -1;

        }


        public static void main(String[] args) {

            int[][] grid= {{0,0,0},{1,1,0},{1,1,0}};
            System.out.println(shortestPathBinaryMatrix(grid));


        }
    }
