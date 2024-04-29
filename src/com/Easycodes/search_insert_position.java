package com.Easycodes;
/* Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
* */

public class search_insert_position {
    static int searchInsert(int[] nums, int target) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i])         // if target is present in array return same index
                return i;
            else if(nums[i]>target)     // if target is less than any on element from start of array return that position
                return i;

        }
        return nums.length;             // if all the elements are less than target return array length i.e last index
    }

    public static void main(String[] args) {
        int n=2,a[]={1,4,5,6};
        System.out.println(searchInsert(a,n));
    }
}
