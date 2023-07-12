package com.BinarySearch;

public class nth_root_number {
static int power(int mid,int n){
    long ans=1;
    while(n>0) {
        if (n % 2 == 1) {
            ans = ans * mid;
            n--;
        } else {
            mid = mid * mid;
            n = n / 2;
        }
    }
return (int) ans;
}
static int nthroot(int n,int m){
    int low=1,high=m;
    while(low<=high){
        int mid=(low+high)/2;
        int midN=power(mid,n);
        if(midN==m)
            return mid;
        else if(midN<m)
            low=mid+1;
        else
            high=mid-1;

    }
    return -1;
}

    public static void main(String[] args) {
        int n=3,m=27;
        System.out.println(nthroot(n,m));
    }
}
