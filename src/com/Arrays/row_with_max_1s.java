package com.Arrays;
/*Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.

Example 1:

Input:
N = 4 , M = 4
Arr[][] = {{0, 1, 1, 1},
           {0, 0, 1, 1},
           {1, 1, 1, 1},
           {0, 0, 0, 0}}
Output: 2
Explanation: Row 2 contains 4 1's (0-based
indexing).*/
public class row_with_max_1s {
    static int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int c=0,index=0,max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1)
                    c++;
            }
            if(c>max){                  // if count is greater than max and assign current i to get index
                max=c;
                index=i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int a[][]={{0, 1, 1, 1},{0, 0, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}};
        int n=4,m=4;
        System.out.println(rowWithMax1s(a,n,m));
    }
}
