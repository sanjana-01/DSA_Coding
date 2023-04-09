package com.Arrays.Medium;
import java.util.*;
/*Given an array of integers nums and an integer target, return indices of the two numbers such
 that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.
        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Approach 1 : bruteforce
        Approach 2 : using hashing , a+b=sum if sum-b is present in map return index
        */
public class two_sum {
    static int[] twoSum(int[] nums, int target) {
//        int r[] = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {          // if sum of two elem is target, retrieve its i and j
//                    r[0] = i;
//                    r[1] = j;
//                }
//            }
//        }
//        return r;
//    }
        int arr[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                arr[0] = map.get(target - nums[i]);
                arr[1] = i;
            }
        map.put(nums[i], i);
    }
    return arr;
}

    public static void main(String[] args) {
        int[] a={2,7,11,15};
        int target=9;
        int[] output=twoSum(a,target);
        for(int i :output) {
            System.out.print(i + " ");
        }
    }
}
