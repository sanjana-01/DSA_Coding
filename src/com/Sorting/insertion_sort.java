package com.Sorting;

public class insertion_sort {
    static int[] ins_sort(int[] arr) {
        int size = arr.length;
        for(int i=1;i<size;i++){
            int j=i;
            while(j>0 && arr[j+1]>arr[j]) {
                int temp = arr[j-1];
                arr[j - 1] = arr[j];
                arr[j]=temp;
                j--;
            }
        }
        return arr;
    }

    static int[] ins_sortv1(int[] arr) {
        int size = arr.length;
        for(int i=1;i<size;i++){
            int j=i-1;
            int temp=arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int a[]={2,1,3,5,0};
        ins_sort(a);
        for(int i:a)
            System.out.print(i+" ");
    }
}
