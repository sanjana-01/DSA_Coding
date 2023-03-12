package com.Hashmaps;

import java.util.HashMap;

//Given an array A[] of N positive integers which can contain integers from 1 to P where elements can be repeated or can be absent from the array.
// Your task is to count the frequency of all elements from 1 to N.
//        Note: The elements greater than N in the array can be ignored for counting and do modify the array in-place.
//
//
//        Example 1:
//
//        Input:
//        N = 5
//        arr[] = {2, 3, 2, 3, 5}
//        P = 5
//        Output:
//        0 2 2 0 1
//        Explanation:
//        Counting frequencies of each array element
//        We have:
//        1 occurring 0 times.
//        2 occurring 2 times.
//        3 occurring 2 times.
//        4 occurring 0 times.
//        5 occurring 1 time.
public class freq_hashmap {
    public static HashMap frequencyCount(int arr[], int N, int P) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i : arr) {
            h.put(i, h.getOrDefault(i, 0) + 1);

        }
        return h;

    }

    public static void main(String[] args) {
        int a[]={2,3,2,3,5};
        int n=5,p=5;
        System.out.println(frequencyCount(a,n,p));
    }
}
