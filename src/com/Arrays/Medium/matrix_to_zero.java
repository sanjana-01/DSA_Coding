package com.Arrays.Medium;
/*Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Approach 1 : take temporary matrix of same size and and update all the values as -1 or something and
whenever 0 found in matrix update the row and col as 0s . At last copy the matrix A[i][j]=temp[i][j]
 n*m * (n+m)
*/
public class matrix_to_zero {
    public static void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        int[] col=new int[cols];  // take 2 diff arrays to track rows and cols status
        int[] row=new int[rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){    // update the rows and cols to 1 if there is 0
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(row[i] ==1 || col[j]==1){
                    matrix[i][j]=0;         // then update to 0 wherever there are ones
                }
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
