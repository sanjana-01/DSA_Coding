package com.Arrays.Easy;
/*Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:
Input:
N = 5
A[] = {1,2,3,5}
Output: 4
*/
public class missing_num {
    static int miss_num(int[] arr){
        int n=arr.length;
        int sum=(n*(n+1))/2;
        for(int i=0;i<n-1;i++){
            sum=sum-arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,5};
        System.out.println(miss_num(a));
    }
}
