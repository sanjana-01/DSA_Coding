package com.Arrays.Easy;
/**/
public class second_largest_num {
    static int print2largest(int arr[], int n) {
        // code here
        int large=arr[0];
        int seclarge=-1;
        for(int i=1;i<n;i++){

            if(arr[i]>large){
                seclarge=large;
                large=arr[i];
            }
            else if(arr[i]>seclarge && arr[i]<large){
                seclarge=arr[i];
            }

        }
        return seclarge;
    }
    public static void main(String[] args) {
        int a[]={35, 35,35};
        int n=3;
        System.out.println(print2largest(a,n));
    }
}
