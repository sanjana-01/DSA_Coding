package com.BinarySearch;
/*You have N books, each with Ai number of pages. M students need to be allocated contiguous books, with each student getting at least one book.
Out of all the permutations, the goal is to find the permutation where the student with the most pages allocated to him gets the minimum number of pages, out of all possible permutations.
Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).

Input:
N = 4
A[] = {12,34,67,90}
M = 2
Output:113
Explanation:Allocation can be done in
following ways:
{12} and {34, 67, 90} Maximum Pages = 191
{12, 34} and {67, 90} Maximum Pages = 157
{12, 34, 67} and {90} Maximum Pages =113.
Therefore, the minimum of these cases is 113,
which is selected as the output.*/
public class book_allocation {
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
        int[] a={12,34,67,90};
        int n=4,k=2;
        System.out.println(findPages(a,n,k));
    }
}
