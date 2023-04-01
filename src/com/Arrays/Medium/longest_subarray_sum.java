package com.Arrays.Medium;
import java.util.*;
public class longest_subarray_sum {
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        int sum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            sum=sum+A[i];
            if(sum==K){
                count++;
            }
            //if (prefix sum - k) is present in the map.
            // If yes, then it implies that there are possible subarray. Now we add the frequency to the count because
            // if there might be more than one in the given array where the subarray sum is equal to k.
            count=count+map.get(sum-K);
        }
        map.put(sum, map.getOrDefault(sum, 0)+1);

        return count;
    }

    public static void main(String[] args) {
        int a[]={10, 5, 2, 7, 1, 9};
        int n=6,k=15;
        lenOfLongSubarr(a,n,k);
        System.out.println(lenOfLongSubarr(a,n,k));
    }
}

