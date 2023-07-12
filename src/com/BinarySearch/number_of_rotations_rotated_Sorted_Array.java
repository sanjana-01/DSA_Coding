package com.BinarySearch;

public class number_of_rotations_rotated_Sorted_Array {
    public static int findKRotation(int arr[]) {
        int low = 0, high = arr.length - 1, ans = Integer.MAX_VALUE, index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[low] <= arr[high]) {                   // find the index of minimum element which gives the rotations
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                break;
            }
            if (arr[low] <= arr[mid]) {                 // if left is sorted
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                low = mid + 1;
            } else {
                if (arr[mid] < ans) {                     // if right is sorted
                    index = low;
                    ans = arr[mid];
                }
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = {6,1,2,3,4,5};
        System.out.println(findKRotation(arr));
    }
}
