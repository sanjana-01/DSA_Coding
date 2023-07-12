package com.BinarySearch;

public class upperbound {
    public static int upperBound(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int ans = n;

        while(low<= high){
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;             // search for small index towards left
            } else
                low = mid + 1;              // search towards right

        }
        return ans;
    }

    public static void main(String[] args) {
int arr[]={2,3,6,7,8,8,11,11,11,12};
int n=10;
int x=12;
System.out.print(upperBound(arr,n,x));
    }
}
