package com.BinarySearch;
import java.util.*;
/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).
Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.*/
public class median_sorted_arrays {
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums2.length < nums1.length)
            return findMedianSortedArrays(nums2, nums1);
        int n1 = nums1.length;
        int n2 = nums2.length;

        int low = 0, high = n1;
        while (low <= high) {
            int c1 = (low + high) / 2;
            int c2 = (n1 + n2 + 1) / 2 - c1;
            // edge cases
            int l1 = c1 == 0 ? Integer.MIN_VALUE : nums1[c1 - 1];         // if we are not taking anything from left make it min
            int l2 = c2 == 0 ? Integer.MIN_VALUE : nums2[c2 - 1];
            int r1 = c1 == n1 ? Integer.MAX_VALUE : nums1[c1];             // if we are not taking anything from right make it max
            int r2 = c2 == n2 ? Integer.MAX_VALUE : nums2[c2];

            if (l1 <= r2 && l2 <= r1) {
                if ((n1 + n2) % 2 == 0)                     // if even , mid will be summation of 2numbers divided by 2
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                else
                    return Math.max(l1, l2);         // if odd single element would be mid
            } else if (l1 > r2) {
                high = c1 - 1;                  // if greater element reduce it by decrease cut
            } else
                low = c1 + 1;                   // if lesser element increase it by incr cut

        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2};
        int[] a2 = {3, 4};
        System.out.println((findMedianSortedArrays(a1, a2)));
    }
}
