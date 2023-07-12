package com.BinarySearch;
/*Given a sorted array arr[] of size N without duplicates, and given a value x.
Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x.
Find the index of K(0-based indexing).

Input:
N = 7, x = 0
arr[] = {1,2,8,10,11,12,19}
Output: -1
Explanation: No element less than 0 is found. So output is "-1".
 if (arr[i] >= x)
        return i;       //bruteforce

*/
public class floor_ceil_in_sorted_array {
    public static int findFloor(int[] arr,int n,int x)
    {
        int low = 0,high=n-1,ans=-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]<=x){
                ans = mid;
                low = mid+1;
            }
            else
                high = mid-1;
        }
        return ans;
    }

    public static int findceil(int[] arr,int n,int x)
    {
        int low = 0,high=n-1,ans=-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a={1,2,8,10,11,12,19};
        int x=5,n=7;
        int ans=findFloor(a,n,x);
        int ans1=findceil(a,n,x);
        System.out.println(ans);
        System.out.println(ans1);
    }
}
