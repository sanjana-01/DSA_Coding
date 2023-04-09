package com.Arrays.Medium;
/*You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
DO NOT allocate another 2D matrix and do the rotation.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]*/
public class rotate_matrix {

    static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int rotate[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotate[j][n - 1 - i] = matrix[i][j];        //place first row as last column and so on
                //every i is converting to (n-1)-i  for j and every j is converting to i
            }
        }
        return rotate;
    }

    public static void main(String args[]) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rotate[][] = rotate(arr);
        for (int i = 0; i < rotate.length; i++) {
            for (int j = 0; j < rotate.length; j++) {
                System.out.print(rotate[i][j] + " ");
            }
            System.out.println();
        }

    }
}
