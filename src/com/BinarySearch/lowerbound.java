package com.BinarySearch;

public class lowerbound {
    public static int lowerBound(int []arr, int n, int x) {
        int low=0;
        int high =n-1;
        int ans=n;

        while(low<=high){
            int mid =(low+high)/2;

            if(arr[mid] >= x){
                ans=mid ;
                high =mid-1;            // search for small index towards left
            }
            else
                low=mid+1;              // go and search towards right
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,3,7,8,9,9,9,11};
        int n=10;
        int x=9;
        System.out.print(lowerBound(arr,n,x));
    }

}
