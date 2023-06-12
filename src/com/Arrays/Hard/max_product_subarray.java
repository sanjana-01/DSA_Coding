package com.Arrays.Hard;
/*Given an integer array nums, find a
subarray
 that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.*/
public class max_product_subarray {
//    static int max_product(int[] arr){
//        int max=0;
//        for (int i = 0; i < arr.length; i++) {
//            int prod = 1;
//            for (int j = i; j < arr.length; j++) {
//                prod *= arr[j];
//                if (prod > max)
//                    max = prod;
//            }
//        }
//        return max;
//    }

    public static int maxProduct(int[] nums) {

        int max=nums[0];
        int min=nums[0];
        int ans=nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0){                               // Swap min and max if negative element
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i], max * nums[i]);             // calculate max from current element and the contiguous element product
            min = Math.min(nums[i], min * nums[i]);             // same way calculate min

            ans = Math.max(ans, max);
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr={4,2,3,-2,4};
        System.out.println(maxProduct(arr));
    }
}
