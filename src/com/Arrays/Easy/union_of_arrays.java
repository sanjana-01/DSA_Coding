package com.Arrays.Easy;
import java.util.*;
/*Union of two arrays can be defined as the common and distinct elements in the two arrays.
Given two sorted arrays of size n and m respectively, find their union.

Example 1:

Input:
n = 5, arr1[] = {1, 2, 3, 4, 5}
m = 3, arr2 [] = {1, 2, 3}
Output: 1 2 3 4 5
Explanation: Distinct elements including
both the arrays are: 1 2 3 4 5.

O(nlogn1)+O(nlogn2)+O(n1+n2) --> nlogn for adding into set and for returning it takes n1+n2
*/

public class union_of_arrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 4, 5, 6, 7 };

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        for (int i : set) {
            System.out.print(i + " ");
        }
    }
}
