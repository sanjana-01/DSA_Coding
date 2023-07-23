package com.Graphs.problemsonbfsdfs;
//O(NxM + NxMx4) ~ O(N x M)
//
//For the worst case, all of the pixels will have the same colour,
// so DFS function will be called for (N x M) nodes and for every node we are traversing for 4 neighbours, so it will take O(N x M x 4) time.
public class floodfill {
    public static void dfs(int row, int col, int[][] ans, int[][] image, int newColor, int initialCol) {
        ans[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;

        int delrow[] = {-1, 0, +1, 0};
        int delcol[] = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];

            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
                    image[nrow][ncol] == initialCol && ans[nrow][ncol] != newColor) {
                dfs(nrow, ncol, ans, image, newColor, initialCol);
            }

        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialCol = image[sr][sc];
        int[][] ans = image;

        dfs(sr, sc, ans, image, color, initialCol);
        return ans;

    }

    public static void main(String[] args) {
        int[][] a={{1,1,1},{1,1,0},{1,0,1}};
        int sr=1,sc=1;
        int color=2;
        int[][] arr =floodFill(a, sr, sc, color);
        int rows=arr.length;
        int cols=arr[0].length;
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
