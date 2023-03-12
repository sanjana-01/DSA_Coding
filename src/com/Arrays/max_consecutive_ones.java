package com.Arrays;
/*Given a binary array nums, return the maximum number of consecutive 1's in the array.
Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
*/
//Approach 1 : without using max function break when 0 else increment count and find out maximum of both
//Approach 2 :
public class max_consecutive_ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int ones=0;
        int maxones=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
                ones++;
            else
                ones=0;
            maxones= Math.max(ones,maxones);
        }
        return maxones;
    }

    public static void main(String[] args) {
        int a[]={1,1,1,0,0,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(a));
    }
}
