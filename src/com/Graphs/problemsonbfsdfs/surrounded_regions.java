package com.Graphs.problemsonbfsdfs;
//O(N) + O(M) + O(NxMx4) ~ O(N x M), For the worst case, every element will be marked as ‘O’ in the matrix, and
// the DFS function will be called for (N x M) nodes and for every node, we are traversing for 4 neighbors,
// so it will take O(N x M x 4) time. Also, we are running loops for boundary elements so it will take O(N) + O(M).
public class surrounded_regions {
    private static void dfs(int row, int col, int[][] visited, char[][] mat, int[] delrow,int[] delcol ) {
        visited[row][col]=1;
        int n =mat.length;
        int m =mat[0].length;
        for (int i = 0; i < 4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];

            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
                    visited[nrow][ncol]==0 && mat[nrow][ncol]=='O'){
                dfs(nrow,ncol,visited, mat,delrow,delcol);
            }
        }
    }
    static char[][] fill(int n, int m, char mat[][])
    {
        int[][] visited=new int[n][m];
        int delrow[] = {-1, 0, +1, 0};
        int delcol[] = {0, 1, 0, -1};

        for(int j=0;j<m ;j++){

            if(visited[0][j]==0  && mat[0][j]=='O'){             // traverse first row
                dfs(0,j,visited,mat,delrow,delcol);
            }

            if(visited[n-1][j]==0 &&mat[n-1][j]=='O' ){          //traverse last row
                dfs(n-1,j,visited,mat,delrow,delcol);
            }
        }

        for(int i=0;i<n ;i++){
            if(visited[i][0]==0  && mat[i][0]=='O'){            // traverse first col
                dfs(i,0,visited,mat,delrow,delcol);
            }

            if(visited[i][m-1]==0 &&mat[i][m-1]=='O' ){         //traverse last col
                dfs(i,m-1,visited,mat,delrow,delcol);
            }
        }


        for(int i =0 ;i < n ;i++){                                  //traverse array again for the 0's left and is not marked , has to be X
            for(int j=0;j < m;j++){
                if(visited[i][j]==0 && mat[i][j]=='O'){
                    mat[i][j]='X';
                }
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        char[][] mat={{'X', 'X', 'X', 'X'},
                {'O', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'X', 'O', 'O'}};

        char[][] output=fill(mat.length,mat[0].length,mat);
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
