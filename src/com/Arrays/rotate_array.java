package com.Arrays;
/*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3     4 3 2 1 7 6 5 --> 5 6 7 1 2 3 4
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]*/
public class rotate_array {
    static void reverse(int[] nums, int low, int high){
        while(low<high){                                // swap the elements to reverse the array
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
    }
    public static int[] rotate(int[] nums, int k) {
        k=k%nums.length;                                        // this is to reduce the number of shifts if bigger is the k (if rotation >size)
        reverse(nums,0,nums.length-k-1);                // reverse the first elemtns
        reverse(nums,nums.length-k,nums.length-1);      //reverse the last k elements
        reverse(nums,0,nums.length-1);                  // reverse whole array

        return nums;
    }

    public static void main(String[] args) {
    int a[]={1,2,3,4,5,6,7};
    int k=3;
    rotate(a,k);
   for(int i:a)
       System.out.print(i+" ");

    }
}
