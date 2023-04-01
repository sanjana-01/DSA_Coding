package com.Arrays.Medium;
import java.util.*;
/*Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.


Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9*/
public class longest_sequence {
    static int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;
        Arrays.sort(nums);
        int c = 1;
        int max = 0;

        for (int i = 1; i < nums.length; i++) {
            //if consecutive value exists
            if (nums[i] == nums[0] + 1) {
                c++;
            }
            //if different sequence
            else if (nums[i] != nums[0]) {
                c = 1;
            }

            //make current i as prev
            nums[0] = nums[i];
            max = Math.max(max, c);

        }
        return max;
    }

    public static void main(String[] args) {
    int a[]={100,4,200,1,3,2};
    int ans=longestConsecutive(a);
        System.out.println(ans);
    }
}
