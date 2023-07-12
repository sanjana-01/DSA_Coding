package com.BinarySearch;
/*Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.
Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4*/
public class binarysearch {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low <= high){                     // calculate mid-value and if it's greater than mid ,increment mid to find position of element
            int mid = (low + high)/2;
            if(nums[mid] == target)
                return mid;
            else if(target > nums[mid])
                low = mid + 1;
            else
                high = mid - 1;                 // else decrement the mid
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a ={-1,0,3,5,9,12};
        int t=9;
        int ans=search(a,t);
        System.out.println(ans);
    }
}
