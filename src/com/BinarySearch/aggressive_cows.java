package com.BinarySearch;
import java.util.*;
/*You are given an array consisting of n integers which denote the position of a stall. You are also given an integer k which denotes the number of aggressive cows. You are given the task of assigning stalls to k cows such that the minimum distance between any two of them is the maximum possible.
The first line of input contains two space-separated integers n and k.
The second line contains n space-separated integers denoting the position of the stalls.

Example 1:

Input:
n=5
k=3
stalls = [1 2 4 8 9]
Output:
3
Explanation:
The first cow can be placed at stalls[0],
the second cow can be placed at stalls[2] and
the third cow can be placed at stalls[3].
The minimum distance between cows, in this case, is 3,
which also is the largest among all possible ways.*/
public class aggressive_cows {
    static boolean canweplace(int[] stalls,int d,int c) {
        int count = 1, last = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - last >= d) {
                count++;
                last = stalls[i];
            }
            if (count >= c)
                return true;

        }
        return false;
    }
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int low=1,high=stalls[n-1]-stalls[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(canweplace(stalls,mid,k)==true){
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return high;
    }

    public static void main(String[] args) {
        int n=5,k=3;
        int[] stalls={1,2,4,8,9};
        System.out.println(solve(n,k,stalls));
    }
}
