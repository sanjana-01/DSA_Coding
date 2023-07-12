package com.BinarySearch;

public class squareroot {
    public static long floorSqrt(long x)
    {
        // Your code here
        long low=1,high=x;
        while(low<=high){
            long  mid=(low+high)/2;
            long  ans =mid*mid;
            if(ans<=x)
                low=mid+1;          // eliminate the left if we can get the ans from right and vice versa
            else
                high=mid-1;
        }
        return high;
    }

    public static void main(String[] args) {
        int x=28;
        System.out.println(floorSqrt(x));
    }
}
