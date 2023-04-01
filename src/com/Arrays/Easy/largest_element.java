package com.Arrays.Easy;
/*Given an array A[] of size n. The task is to find the largest element in it.

Example 1:

Input:
n = 5
A[] = {1, 8, 7, 56, 90}
Output:
90
Explanation:
The largest element of given array is 90.
*/
//Appraoch 1: sort in ascending order and print last element
public class largest_element {
    public static int largest(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = {1, 8, 7, 56, 56,90};
        System.out.println(largest(a));
    }
}
