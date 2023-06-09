package com.Arrays.Medium;
import java.util.*;
/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
Example 1:

Input: nums = [3,2,3]
Output: 3

Approach 1: iterate all the elements and count ++, if count > n/2 return that element.
Approach 2: using hashmap, develop frequency hashmap and search in keyset() if it is > n/2 return key.
Approach 3: moore voting algorithm
*/


public class majority_element {
    static int major(int[] nums){
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        return nums[nums.length/2];         // after sorting , majority element would be mid elem
    }

    public static void main(String[] args) {
        int a[]={2,1,2,2,3};
        System.out.println(major(a));
    }
}
