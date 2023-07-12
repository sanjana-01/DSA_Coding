package com.BinarySearch;
/*You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly
 once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2*/
public class single_element {
    static int findOnce(int arr[], int n)
    {
        //handling edges cases to perform binary search
        //for single element
        if(n==1) return arr[0];

        //we are performing binary search from 2nd element to 2nd last element
        //in order to avoid out of bound issues
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];

        //start from 2nd element and keep high as 2nd last
        int low = 1, high = n-2;

        while (low <= high) {
            int mid = (low + high) /2 ;
            // check if your  mid-element is single element
            if (arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1] ){
                return arr[mid];
            }

            if( (mid % 2==0 && arr[mid]==arr[mid+1]) || (mid % 2==1 && arr[mid]==arr[mid-1])){
                low=mid+1;
            }

            else{
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,2,3,3,4,5,5};
        int n=6;
        System.out.println(findOnce(arr,n));
    }

}
