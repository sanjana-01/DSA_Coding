package com.Easycodes;
/*Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.

Example 1:

Input:
N = 5
A[] = {-2, 1, -4, 5, 3}
Output: 1
Explanation: min = -4, max =  5. Sum = -4 + 5 = 1
* */
// Approach 1: using math.min and math.max functions to find min and max of elements
public class min_max_element_sum {
    public static int findSum(int A[],int N)
    {
        //code here
        int min=A[0],max=A[0];
        for(int i=0;i<N;i++){
            if(A[i]<min)
                min=A[i];
            else if(A[i]>max)
                max=A[i];
        }
        return max+min;
    }

    public static void main(String[] args) {
        int n=4,a[]={2,-4,3,1};
        System.out.println(findSum(a,n));
    }
}
