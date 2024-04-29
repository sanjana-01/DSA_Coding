package com.BinarySearch;
import java.util.*;

public class search_2d {
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
//        int m = matrix.length;
//        int n = matrix[0].length;
//        for(int i = 0; i < m; i++){
//            if(target > matrix[i][0] && target < matrix[i][n-1]){
//                for(int j = 1; j < n; j++){
//                    if(target == matrix[i][j]){
//                        return true;
//                    }
//                }
//            }
//            else if(target == matrix[i][0]){
//                return true;
//            }
//            else if(target == matrix[i][n-1]){
//                return true;
//            }
//        }
//        return false;
//    }

//    public static void main(String[] args) {
//        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//        int t=3;
//        System.out.println(searchMatrix(arr,t));
//    }

            public static boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target) {
                int n = matrix.size();
                int m = matrix.get(0).size();
                // hypothetically flattening the 2D array into 1D array
                //apply binary search:
                int low = 0, high = n * m - 1;
                while (low <= high) {
                    int mid = (low + high) / 2;
                    int row = mid / m, col = mid % m;       // for getting the index after flattening
                    if (matrix.get(row).get(col) == target) return true;
                    else if (matrix.get(row).get(col) < target) low = mid + 1;
                    else high = mid - 1;
                }
                return false;
            }


            public static void main(String[] args) {
                ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
                matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
                matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
                matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));

                boolean result = searchMatrix(matrix, 8);
                System.out.println(result ? "true" : "false");
            }
        }
