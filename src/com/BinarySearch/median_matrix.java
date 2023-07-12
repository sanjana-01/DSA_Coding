package com.BinarySearch;
/*Given a matrix of integers A of size N x M in which each row is sorted.
Find and return the overall median of matrix A.
NOTE: No extra memory is allowed.
NOTE: Rows are numbered from top to bottom and columns are numbered from left to right.


1 <= N, M <= 10^5
1 <= N*M <= 10^6
1 <= A[i] <= 10^9
N*M is odd

Input Format
The first and only argument given is the integer matrix A.

Output Format
Return the overall median of matrix A.



Input 1:

A = [   [1, 3, 5],
        [2, 6, 9],
        [3, 6, 9]   ]

Example Output
Output 1:
 5
*/
public class median_matrix {
static int countsmallerthanmid(int[] row,int mid){
    int low=0,high=row.length-1;
    while(low<=high){
        int md=(low+high)/2;
        if(row[md]<=mid){
            low=md+1;
        }
        else
            high=md-1;
    }
    return low;
}

static int findmedian(int[][] arr){
    int low=1,high= (int) 1e9;
    int n=arr.length;
    int m=arr[0].length;
    while(low<=high){
        int mid=(low+high)/2;
        int c=0;
        for(int i=0;i<n;i++){
            c+=countsmallerthanmid(arr[i],mid);
        }
        if(c<=(n*m)/2) low=mid+1;
        else high=mid+1;
    }
    return low;
}

    public static void main(String[] args) {
        int a[][]={{1, 3, 5},
                {2, 6, 9},
        {3, 6, 9} };
        System.out.println(findmedian(a));
    }
}
