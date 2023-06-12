package com.Arrays.Hard;

import java.util.Arrays;

/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored.
nums2 has a length of n.
Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Approach 1: using extra array to merge both arrays and finally sort that array.
Approach 2: start form the end of array and check if the elements in array1 are lesser than arr2, place those elements in array1

*/
public class merge_sorted_without_space {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (n < 0)
                return;
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[i] = nums1[m];
                m--;
            } else {
                nums1[i] = nums2[n];
                n--;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0,0};
        int[] nums2 = {2, 5,6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
        for (int i : nums1)
            System.out.print(i + " ");
    }
}
//public static void main(String[] args) {
//    int[] a1={1,3,5,7};
//    int[] a2={0,2,6,8,9};
//    int n=a1.length;
//    int m=a2.length;
//    int i=0,j=0;
//
//    while(i<n){
//        if(a1[i]>a2[j]){                                // compare each element in both the arrays and if element in a1 is gretaer than a2
//            int temp=a1[i];                             // swap them
//            a1[i]=a2[j];
//            a2[j]=temp;
//            sort(a2);                                   // and sort the a2 before checking the next element
//        }
//        i++;
//    }
//    System.out.println(Arrays.toString(a1));
//    System.out.println(Arrays.toString(a2));
//}
//static void sort(int[] a2){
//    for(int i=1;i<a2.length;i++){                       // if next element is less than prev swap them in order to get sorted order
//        if(a2[i]<a2[i-1]){
//            int temp=a2[i];
//            a2[i]=a2[i-1];
//            a2[i-1]=temp;
//        }
//    }
//}
//}
