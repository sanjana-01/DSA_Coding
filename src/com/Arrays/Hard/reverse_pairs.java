package com.Arrays.Hard;

///*Given an integer array nums, return the number of reverse pairs in the array.
//
//A reverse pair is a pair (i, j) where:
//
//0 <= i < j < nums.length and
//nums[i] > 2 * nums[j].
//
//Example 1:
//
//Input: nums = [1,3,2,3,1]
//Output: 2
//Explanation: The reverse pairs are:
//(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
//(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1*/
public class reverse_pairs {
////    public int reversePairs(int[] nums) {
////        int c=0;
////        for(int i=0;i<nums.length;i++){
////            for(int j=i+1;j<nums.length;j++){
////                if((long)nums[i] > (long)2 * nums[j])
////                    c++;
////            }
////        }
////        return c;
////    }
//
public static long mergeSort(int[] arr, int low, int high)
{
    long inv=0;
    if(high>low)
    {
        int mid=(low+high)/2;
        inv+=mergeSort(arr, low, mid);
        inv+=mergeSort(arr, mid+1, high);
        inv+=merge(arr, low, high);
    }

    return inv;
}

    public static long merge(int[] arr, int low, int high)
    {
        int mid=(low+high)/2;
        int i=low, j=mid+1, index=0;
        long inv=0;
        long [] newArr=new long[high-low+1];

        while(i<=mid && j<=high)
        {
            if(2 * arr[j]<arr[i])
            {
                inv+=(mid-i+1);
                newArr[index++]=arr[j++];
            }
            else
            {
                newArr[index++]=arr[i++];
            }
        }

        while(i<=mid)
        {
            newArr[index++]=arr[i++];
        }
        while(j<=high)
        {
            newArr[index++]=arr[j++];
        }

        index=0;

        for(int k=low; k<=high; k++)
        {
            arr[k]= (int) newArr[index++];
        }
        return inv;
    }

    public static void main(String[] args) {
        int[] arr={1,3,2,3,1};

        System.out.println(mergeSort(arr,0,arr.length-1));
    }
}
