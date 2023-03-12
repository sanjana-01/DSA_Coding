package com.Arrays;
import java.util.*;
/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:

Input: nums = [2,2,1]
Output: 1*/
//Approach 1: apply xor operation for each element so that same elements output is 0 by xor and left over element would be output O(n)
//[2, 3, 4, 3, 4]
//        2 ^ 3 = 1
//        1 ^ 4 = 5
//        5 ^ 3 = 6
//        6 ^ 4 = 2
//Approach 2: using hashmap - use freq hashmap and get the element whose freq is 1
public class single_number_array {
    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {            // if element is present again we are removing
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);                   // if not add into set
            }
        }
        Iterator<Integer> iterator = set.iterator();
        return iterator.next();
    }

    public static void main(String[] args) {
        int[] a={1,2,4,2,1};
        System.out.println(singleNumber(a));
    }
}
