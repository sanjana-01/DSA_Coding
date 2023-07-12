package com.BinarySearch;

public class rows_with_max_1s {
    static int rowWithMax1s(int arr[][], int n, int m) {

        // int maxcount=0;
        //     int index =-1;

        //     int ans=0;

        //     for(int i=0;i<n;i++)
        //     {
        //          int count=0;
        //         for(int j=0;j<m;j++)
        //         {
        //             if(arr[i][j]==1)
        //             {
        //                 count++;
        //             }

        //             if(maxcount<count)
        //             {
        //                   maxcount=count;
        //                 index = i;
        //             }
        //         }

        //     }
        //     return index;

        int ans=-1;                         // traverse while col wise so that whenever col value is 1 that row has max 1s as sorted order
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                if(arr[i][j]==1)
                    return i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][]={{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        int n=4,m=4;
        System.out.println(rowWithMax1s(arr,n,m));
    }
}
