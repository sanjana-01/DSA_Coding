package com.BinarySearch;
/*Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.


Input:
N = 7, X = 2
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
Explanation: 2 occurs 4 times in the
given array.*/
public class number_of_occurences {
//    static int count(int[] arr, int n, int x) {
//        // code here
//        int c=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]==x)
//                c++;
//        }
//        return c;
//    }
    public static int lowerBound(int arr[], int n, int x) {
        int low=0;
        int high =n-1;
        int ans=n;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid] >= x){
                ans=mid ;
                high =mid-1;             // search towards left for smallest index
            }
            else
                low=mid+1;               // search towards right

        }
        return ans;
    }

    public static int upperBound(int arr[], int n, int x){
        int low=0;
        int high =n-1;
        int ans=n;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid] > x){
                ans=mid ;
                high =mid-1;                // search towards left for smallest index
            }
            else
                low=mid+1;                  // search towards right
        }
        return ans;
    }

    public static int[] firstAndLastPosition(int arr[], int n, int k) {
        int lb =lowerBound(arr, n, k);
        if(lb==n || arr[lb] !=k)
            return new int[] {-1, -1};
        return new int[] {lb, upperBound(arr, n, k) -1};

    }

    public static int count(int arr[], int n, int x) {
        int[] ans=new int[2];
        ans=firstAndLastPosition(arr,n,x);
        if(ans[0]== -1)
            return 0;
        return ans[1]-ans[0]+1;

    }
    public static void main(String[] args) {
        int[] a={1,1,2,2,2,2,3};
        int t=2,n=7;
        int ans=count(a,n,t);
        System.out.println(ans);
    }
}
