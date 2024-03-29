package com.BinarySearch;
/*Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.
Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.*/
public class kth_missing_number {
    public static int findKthPositive(int[] arr, int k) {
        for(int i : arr){
            if(i <= k)
                k++;
            else
                break;
        }
        return k;
    }

    public static void main(String[] args) {
        int  arr[]={1,2,3,4};
        int k=2;
        System.out.println(findKthPositive(arr,k));
    }
}
