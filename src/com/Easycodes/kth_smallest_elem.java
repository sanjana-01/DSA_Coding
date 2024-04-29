package com.Easycodes;
import java.util.Arrays;
/*Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

Example 1:

Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given
array is 7.*/
// Approach 1 : using tree map as it is sorted
// Approach 2 : using priority queue maintaining k size heap and getting smallest element
public class kth_smallest_elem {
         static int kthSmallest(int[] arr, int k)
        {
            //Your code here
            Arrays.sort(arr);
            return arr[k-1];

        }

    public static void main(String[] args) {
        int k=1,a[]={4,7,2,3,10};
        System.out.println(kthSmallest(a,k));
    }
}

/* define priority queue
for(i=0;i<n;i++){
pq.add(a[i]);
}
for(i=k;i<n;k++)
if(pq.peek()<a[i]{
continue;
else pq.pop();
pq.add(a[i]);
}
return pq.peek();

* */
