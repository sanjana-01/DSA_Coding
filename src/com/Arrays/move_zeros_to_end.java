package com.Arrays;
/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]*/
public class move_zeros_to_end {
    static void move(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {                 //non-zero elements place them at starting
                nums[i++] = nums[j];
            }
        }
        while (i < nums.length) {
            nums[i++] = 0;                      // make rest of places as zero
        }
    }

    public static void main(String[] args) {
        int a[]={2,0,0,1,3,0};
        move(a);
        for(int i:a)
        System.out.print(i+" ");
    }
}
