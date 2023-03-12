package com.Arrays;
/*Given an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.

Example 1:

Input:
N = 5, K = 6
arr[] = {1,2,3,4,6}
Output: 1
Exlpanation: Since, 6 is present in
the array at index 4 (0-based indexing),
output is 1.*/
public class linear_search {
    static int searchInSorted(int arr[], int N, int K)
    {
        int c=0;
        // Your code here
        for(int i=0;i<N;i++){
            if(K==arr[i]){
                c=1;
            }
        }
        if(c==1)
            return 1;
        else
            return -1;

    }

    public static void main(String[] args) {
        int N=5,K=0;
        int a[]={1,2,3,4,6};
        System.out.println(searchInSorted(a,N,K));
    }
}

