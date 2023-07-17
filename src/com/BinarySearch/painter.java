package com.BinarySearch;

public class painter {
    static int countpages(int[] A,int pages){
        int stud=1;
        long pagestudent=0;
        for(int i=0;i<A.length;i++) {
            if (pagestudent + A[i] <= pages)
                pagestudent += A[i];
            else {
                stud += 1;
                pagestudent = A[i];
            }
        }
        return stud;
    }
    private static int findMax(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int n =nums.length;
        for(int i : nums){
            maxi=Math.max(maxi,i);
        }
        return maxi;
    }
    private static int sum(int[] nums) {
        int sum=0;
        for(int i : nums){
            sum+=i;
        }
        return sum;
    }
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        if(M>N)
            return -1;
        int low=findMax(A);
        int high=sum(A);
        while(low<=high){
            int mid=(low+high)/2;
            int stud=countpages(A,mid);
            if(stud>M)
                low=mid+1;
            else
                high=mid-1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] a={10,20,30,40};
        int n=4,k=2;
        System.out.println(findPages(a,n,k));
    }
}
