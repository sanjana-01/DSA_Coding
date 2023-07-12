package com.BinarySearch;
/*Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.


Input:
N = 7, X = 2
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
Explanation: 2 occurs 4 times in the
given array.*/
public class count_occurence {
//    static int count(int[] arr, int n, int x) {
//        // code here
//        int c=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]==x)
//                c++;
//
//        }
//        return c;
//    }
public static int searchRange(int[] nums, int target) {
    int[] ans = new int[2];
    ans[0] = findfirst(nums, target);
    ans[1] = findlast(nums, target);
    int k=ans[1]-ans[0]+1;                          // last - first + 1 gives count
    return k;
}

    // to find first occurrence in array
    public static int findfirst(int[] nums, int target){
        int first = -1;
        int low = 0,high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] >= target){                   // calculate mid and eliminate right and left acc to mid-comparison to target
                high = mid - 1;
            }else{
                low = mid + 1;
            }
            if(nums[mid] == target)                 // if found put mid as first value
                first = mid;
        }
        return first;
    }

    // to find last occurrence in array
    public static int findlast(int[] nums, int target){
        int last = -1;
        int low = 0,high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;             // calculate mid and eliminate right and left acc to mid-comparison to target
            if(nums[mid] <= target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
            if(nums[mid] == target)                 //// if found put mid as last value
                last = mid;
        }
        return last;
    }

    public static void main(String[] args) {
        int[] a={5,7,7,8,8,10};
        int t=8;
        int[] ans= new int[]{searchRange(a, t)};
        for(int i:ans)
            System.out.println(i);
    }
}
