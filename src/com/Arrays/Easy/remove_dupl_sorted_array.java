package com.Arrays.Easy;
/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).*/
public class remove_dupl_sorted_array {
    public static int removeDuplicates(int[] nums) {
        int insert_index = 0;
        for(int index = 1; index < nums.length; index++)
        {
            if(nums[index] != nums[insert_index])
            {
                insert_index++;
                nums[insert_index] = nums[index];
            }
        }
        return insert_index+1;
    }
    public static int removeDuplicatesv1(int[] nums) {
        int insert_index = 1;
        for(int index = 1; index < nums.length; index++)
        {
            if(nums[index] != nums[index -1])
            {
                nums[insert_index] = nums[index];
                insert_index++;

            }
        }
        return insert_index;
    }

    public static void main(String[] args) {
        int a[]={1,1,2,2,3,3,4,4};
        removeDuplicatesv1(a);
        for(int i:a)
        System.out.print(i+" ");
    }
}
