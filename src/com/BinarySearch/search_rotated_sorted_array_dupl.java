package com.BinarySearch;

public class search_rotated_sorted_array_dupl {
    static boolean search(int arr[], int target) {

        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) /2 ;
            if (arr[mid] == target)
                return true;

            // as we have duplicates trim down until we get unique elem
            if(arr[low] == arr[mid] &&  arr[mid] == arr[high]){
                low=low+1;
                high=high-1;
                continue;

            }
            if(arr[low] <= arr[mid]) {
                if (arr[low] <= target && arr[mid] >= target)
                    high = mid - 1;
                else
                    low = mid + 1;
            } else
            {
                if (arr[mid] <= target && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={3,3,1,2,3,4};
        int t=3;
        System.out.println(search(arr,t));
    }

}
