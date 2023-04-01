package com.Arrays.Medium;
/*Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
*/
public class matrix_to_zero {
    public static void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean col=false,row=false;
        for(int i=0;i<n;i++){               // initial col contains 0, make col as true
            if(matrix[i][0]==0)
                col=true;
        }
        for(int j=0;j<m;j++){               // make row as true if initial row has 0
            if(matrix[0][j]==0)
                row=true;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){        // make the 0th value's row and col value as 0
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            if(matrix[i][0]==0){
                for(int j=0;j<m;j++){
                    matrix[i][j]=0;

                }
            }
        }
        for(int j=1;j<m;j++){               // col traversal to see if there are any 0s
            if(matrix[0][j]==0){
                for(int i=0;i<n;i++){
                    matrix[i][j]=0;

                }
            }
        }
        if(row){                        // if any rows contain 0s make the whole row to 0
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        if(col){                        // if any cols contain 0s make whole col to 0
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
    }

    public static void main(String[] args) {
        int a[][] = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int n=a.length;
        int m=a[0].length;
        setZeroes(a);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
