package com.BinarySearch;
/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.


Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

bruteforce - keep 2 pointer first and last update first if it is -1 and update last for remaining occurrences O(N)
optimal - O(logn)
*/


// lower bound for 1st position and upperbound -1 for last position --
public class first_last_position {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = findfirst(nums, target);
        ans[1] = findlast(nums, target);
        return ans;
    }

    // to find first occurrence in array
    public static int findfirst(int[] nums, int target){
        int first = -1;
        int low = 0,high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] >= target){                   // calculate mid and eliminate right and left acc to mid-comparison to target
                high = mid - 1;
            }else{
                low = mid + 1;
            }
            if(nums[mid] == target) {              // if found put mid as first value
                first = mid;
               // high = mid - 1;
            }
        }
        return first;
    }

    // to find last occurrence in array
    public static int findlast(int[] nums, int target){
        int last = -1;
        int low = 0,high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;             // calculate mid and eliminate right and left acc to mid-comparison to target
            if(nums[mid] <= target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
            if(nums[mid] == target)                 // if found put mid as last value
                last = mid;
        }
        return last;
    }

    public static void main(String[] args) {
        int[] a={5,7,7,8,8,10};
        int t=8;
        int[] ans=searchRange(a,t);
        for(int i:ans)
        System.out.println(i);
    }
}