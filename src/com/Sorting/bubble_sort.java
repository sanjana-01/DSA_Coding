package com.Sorting;
/*A sorting technique where adjacent elements get swapped if they are not in sorted order
* Time complexity - O(n^2)*/
public class bubble_sort {
    static void bubble_sort(int[] arr) {
        int size = arr.length;
        int temp = 0;
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (arr[j] > arr[j+1]) {          //if greater swap adjacent elements
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {2, 1, 3, 5, 0};
        bubble_sort(a);
        for(int i:a)
        System.out.print(i+" ");
    }
}
