package com.Easycodes;
/*Given an unsorted array arr[] of size N having both negative and positive integers.
The task is place all negative element at the left end of array without changing the order of positive element and negative element.

Example 1:

Input :
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output :
1  3  2  11  6  -1  -7  -5*/
public class move_neg_to_leftend {
    static int[] move(int[] arr){
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int a[]={1, -1, 3, 2, -7, -5, 11, 6};
        move(a);
        for(int i:a)
        System.out.print(i+" ");
    }
}
