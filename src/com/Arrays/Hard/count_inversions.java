package com.Arrays.Hard;

public class count_inversions {
        // arr[]: Input Array
        // N : Size of the Array arr[]
        //Function to count inversions in the array.
//        static long inversionCount(long arr[], long N)
//        {
//            // Your Code Here
//            // int c=0;
//            // for(int i=0;i<N;i++){
//            //     for(int j=i+1;j<N;j++)
//            //     {
//            //         if(arr[i]>arr[j])
//            //         c++;
//            //     }
//            // }
//            // return c;
//
//            long inv=mergeSort(arr, 0, arr.length-1);
//            return inv;
//        }

        public static long mergeSort(long[] arr, int low, int high)
        {
            long inv=0;
            if(high>low)
            {
                int mid=(low+high)/2;

                inv+=mergeSort(arr, low, mid);
                inv+=mergeSort(arr, mid+1, high);
                inv+=merge(arr, low, high);
            }

            return inv;
        }

        public static long merge(long[] arr, int low, int high)
        {
            int mid=(low+high)/2;
            int i=low, j=mid+1, index=0;
            long inv=0;
            long [] newArr=new long[high-low+1];

            while(i<=mid && j<=high)
            {
                if(arr[j]<arr[i])                           // while merging if arr[i] > arr[j] count inversions
                {
                    inv+=(mid-i+1);
                    newArr[index++]=arr[j++];
                }
                else
                {
                    newArr[index++]=arr[i++];
                }
            }

            while(i<=mid)
            {
                newArr[index++]=arr[i++];
            }
            while(j<=high)
            {
                newArr[index++]=arr[j++];
            }

            index=0;
            for(int k=low; k<=high; k++)
            {
                arr[k]=newArr[index++];
            }
            return inv;
        }

    public static void main(String[] args) {

            long arr[]={5,3,2,1,4};
            System.out.print( mergeSort(arr,0, arr.length-1));

        }
    }
