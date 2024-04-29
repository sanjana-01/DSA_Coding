package com.BinarySearch;

import java.util.*;
/*Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.

Example 1:

Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true*/
public class search_row_col_2d {
//    public static boolean searchMatrix(int[][] matrix, int target) {
//        // for(int i = 0; i < matrix.length; i++){
//        //     for(int j = 0; j < matrix[0].length; j++){
//        //         if(matrix[i][j] == target) return true;
//        //     }
//        // }
//        // return false;
//
//        int i = 0;
//        int j = matrix[0].length - 1;
//
//        while(i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length){
//            if(matrix[i][j] == target) return true;
//            else if(matrix[i][j] > target) j--;
//            else if(matrix[i][j] < target) i++;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int arr[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
//        int t=5;
//        System.out.println(searchMatrix(arr,t));
//    }

     public static boolean searchElement(ArrayList<ArrayList<Integer>> matrix, int target) {
            int n = matrix.size();
            int m = matrix.get(0).size();
            int row = 0, col = m - 1;

            //traverse the matrix from (0, m-1):
            while (row < n && col >= 0) {                       // incr row and decr col in search of element
                if (matrix.get(row).get(col) == target)
                    return true;
                else if (matrix.get(row).get(col) < target)
                    row++;
                else col--;
            }
            return false;
        }

        public static void main(String[] args) {
            ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
            matrix.add(new ArrayList<>(Arrays.asList(1, 4, 7, 11, 15)));
            matrix.add(new ArrayList<>(Arrays.asList(2, 5, 8, 12, 19)));
            matrix.add(new ArrayList<>(Arrays.asList(3, 6, 9, 16, 22)));
            matrix.add(new ArrayList<>(Arrays.asList(10, 13, 14, 17, 24)));
            matrix.add(new ArrayList<>(Arrays.asList(18, 21, 23, 26, 30)));

            boolean result = searchElement(matrix, 8);
            System.out.println(result ? "true" : "false");
        }
    }
