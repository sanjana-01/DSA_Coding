package com.BinarySearch;

public class search_2d {
    public static boolean searchMatrix(int[][] matrix, int target) {
//     int m = matrix.length;

//     int n = matrix[0].length;
//     int row = 0;
//     int col = n - 1;
//     while (row < m && col >= 0) {
//         if (matrix[row][col] == target) {
//             return true;
//         } else if (matrix[row][col] > target) {
//             col--;
//         } else {
//             row++;
//         }
//     }
//     return false;
// }
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++){
            if(target > matrix[i][0] && target < matrix[i][n-1]){
                for(int j = 1; j < n; j++){
                    if(target == matrix[i][j]){
                        return true;
                    }
                }
            }
            else if(target == matrix[i][0]){
                return true;
            }
            else if(target == matrix[i][n-1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int t=3;
        System.out.println(searchMatrix(arr,t));
    }
}
