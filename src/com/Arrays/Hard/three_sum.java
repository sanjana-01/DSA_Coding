package com.Arrays.Hard;
import java.util.*;
/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Approach 1 : using 3 loops find out the three elements that sum up to zero - O(n^3)
Approach 2 : using hashmap - O(n^2)

*/
public class three_sum {

    static List<List<Integer>>  ans = new ArrayList <> ();              // creating list ans to add all the final elements
    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);                                              // sort all the elements
        for(int i=0;i<nums.length;i++){
            if(i==0||nums[i-1]!=nums[i]){                              // a+b+c=0 , c=-(a+b) making a to be fixed and calling twosum to find b and c
                twosum(i+1,nums.length-1,nums,0-nums[i]);
            }
        }
        return ans;
    }
    static void twosum(int i, int j, int[] nums, int target){
        int a=nums[i-1];                                            // a is the first element initially
        while(i<j){
            if(nums[i]+nums[j]>target)                              // if b+c > target , decrement j
                j--;
            else if(nums[i]+nums[j]<target)                         // if b+c < target , increment i
                i++;
            else{                                                   // if b+c=target then add a,b,c to list
                List<Integer>list=new ArrayList<>();
                list.add(a);
                list.add(nums[i]);
                list.add(nums[j]);

                ans.add(list);                                      // add list of all elements to ans list

                while(i<j && nums[i]==nums[i+1])i++;                // preventing b duplicate
                while(i<j && nums[i]==nums[j-1])j--;                // preventing c duplicate
                i++;j--;                                            // incrementing the pointers
            }
        }
    }

    public static void main(String[] args) {
        int a[]={-1,-1,0,1};
        List<List<Integer>>  ans=threeSum(a);
        for(List<Integer> i:ans)
        System.out.println(i+" ");
    }
}
