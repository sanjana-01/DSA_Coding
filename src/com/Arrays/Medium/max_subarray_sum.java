package com.Arrays.Medium;
/*Given an integer array nums, find the
subarray
 with the largest sum, and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Approach 1 : using hashmap sum-k
Approach 2 : using sliding window technique  O(N)
Approach 3 : kadanes algo
*/
public class max_subarray_sum {
    static int subarray_sum(int[] nums,int n) {
//        int max=0;
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            for (int j = i; j < n; j++) {
//                sum += arr[j];
//                if (sum > max)
//                    max = sum;
//            }
//        }
//        return max;
//    }
        int maxSum = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int a[] = {5,-4,1,-7,8,1};
        int n=a.length;
        System.out.println(subarray_sum(a,n));
    }
}

