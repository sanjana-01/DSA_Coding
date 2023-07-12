package com.BinarySearch;
/*Given an ascending sorted rotated array Arr of distinct integers of size N. The array is right rotated K times. Find the value of K.

Input:
N = 5
Arr[] = {5, 1, 2, 3, 4}
Output: 1
Explanation: The given array is 5 1 2 3 4.
The original sorted array is 1 2 3 4 5.
We can see that the array was rotated
1 times to the right.*/
public class number_of_rotations {
    public static int findKRotation(int[] a){
//            int low=0,high=a.length-1;
//
//            int ans=Integer.MAX_VALUE;
//            while(low<=high){
//                int mid=(low+high)/2;
//                if(a[low]<=a[mid]){
//                    ans=Math.min(ans,a[low]);
//                    low=mid+1;
//                }
//                else{
//
//                    high=mid-1;
//                    ans=Math.min(ans,a[mid]);
//                }
//            }
//            return ans;

        int low = 0;
        int high = a.length-1;
        int res = 0;
        while(low<=high){
            if(a[low]>a[high]){
                res++;
                low++;
            }else{
                high--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int a[]={4,5,6,7,0,1,2};
        int ans=findKRotation(a);
        System.out.println(ans);
    }
}
