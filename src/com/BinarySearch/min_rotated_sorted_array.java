package com.BinarySearch;
import java.util.*;
/*Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.*/
public class min_rotated_sorted_array {
    public static int mini(int[] a){
        int low=0,high=a.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if (a[low] <= a[high]) {
                ans=Integer.min(ans,a[low]);
                break;
            }
            if(a[low]<=a[mid]){
                //once we are done with heck on left side ,eliminate left and move towards right for searching
                // pick the min element form sorted half and eliminate as sorted half may or may not contain min elem
                ans=Math.min(ans,a[low]);
                low=mid+1;
            }
            else{
                high=mid-1;
                ans=Math.min(ans,a[mid]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={0,1,2,3,4,5,6};
        int ans=mini(a);
        System.out.println(ans);
    }
}
