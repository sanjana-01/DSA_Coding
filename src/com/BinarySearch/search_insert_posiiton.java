package com.BinarySearch;
/*Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2*/
public class search_insert_posiiton {
    public static int searchInsert(int[] nums, int target) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i])                 // return index of macthed element
                return i;
            else if(nums[i]>target)
                return i;
        }
        return nums.length;                         // if target is greater than elements present in array print length of array as index
    }
    public static int searchinsertbinary(int[] nums,int target){
        int low=0, high=nums.length-1;
        int ans=nums.length;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid] >=target){
                ans=mid;
                high=mid-1;}
            else
                low=mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a={1,3,5,6};
        int t=2;
        int ans=searchInsert(a,t);
        int ans1=searchinsertbinary(a,t);
        System.out.println(ans);
        System.out.println(ans1);
    }
}
