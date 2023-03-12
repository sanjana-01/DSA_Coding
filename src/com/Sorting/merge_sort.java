package com.Sorting;

public class merge_sort {

    static  void mergeArrays(int[] arr,int startIndex, int mid , int endIndex){
        int size=endIndex-startIndex+1;
        int[] output = new int [size];
        int i=startIndex;
        int j =mid+1;
        int k=0;

        while(i <= mid  && j<=endIndex){
            if(arr[i] <= arr[j]){
                output[k++]=arr[i++];
            }
            else{
                output[k++]=arr[j++];
            }
        }

        while(i <=mid){
            output[k++]=arr[i++];
        }

        while(j <=endIndex){
            output[k++]=arr[j++];
        }

        //copying of temp array to original array
        int index=0;
        for(int n=startIndex;n <= endIndex;n++){
            arr[n]=output[index];
            index++;
        }

    }
    static void merge(int[] arr, int startIndex, int endIndex){
        //base case
        if(startIndex >= endIndex){
            return ;
        }
        int mid = (startIndex+endIndex) / 2;
        merge(arr,startIndex,mid);
        merge(arr,mid+1,endIndex);
        mergeArrays(arr, startIndex,mid,endIndex);

    }

    public static void main(String[] args) {
        int arr[]={2,8,8,6,5,4,3};
        merge(arr,0, arr.length-1);

        for(int i : arr){
            System.out.print(i +" ");
        }

    }
}
