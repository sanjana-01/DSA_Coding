package com.Arrays.Medium;
/*Given an array A of positive integers. Your task is to find the leaders in the array.
An element of array is leader if it is greater than or equal to all the elements to its right side.
The rightmost element is always a leader.

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17
as it is greater than all the elements
to its right.  Similarly, the next
leader is 5. The right most element
is always a leader so it is also

Approach 1 : bruteforce O(n^2) check each and evry elemtn if greater
Approach 2 : start from last of array and check each and every elemtn is greater to right elem and print them
*/
public class leaders_array {
    static void leaders(int[] arr) {
        // Your code here
        int n = arr.length;
        int max = arr[n - 1];
        System.out.print(arr[n - 1] + " ");
        for (int i = n - 2; i >= 0; i--)        //iterate from last
            if (arr[i] > max) {
                System.out.print(arr[i] + " ");
                max = arr[i];           // replace the updated leader to max
            }
    }

    public static void main(String[] args) {
        int a[]={16,17,4,3,5,2};
        leaders(a);
    }
}
