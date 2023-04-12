package com.Arrays.Medium;
//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
//
//
//Example 1:
//
//Input:
//N = 5
//arr[]= {0 2 1 2 0}
//Output:
//0 0 1 2 2
//Explanation:
//0s 1s and 2s are segregated
//into ascending order.
public class sort012 {
    static int[] sort_num(int[] arr){
        int i, c0 = 0, c1 = 0, c2 = 0;
        // Count the number of 0s, 1s and 2s in the array
        for (i = 0; i <arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    c0++;
                    break;
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
            }
        }
        // Update the array
        i = 0;
        while (c0 > 0) {            // Store all the 0s in the beginning
            arr[i++] = 0;
            c0--;
        }
        while (c1 > 0) {           //  all the 1s
            arr[i++] = 1;
            c1--;
        }
        while (c2 > 0) {          // all the 2s
            arr[i++] = 2;
            c2--;
        }
        return arr;
    }
//    //best approach
//    //Dutch National Flag Algorithm
//    //To=(N)
//    //So(1)
//
//    public static void sort012(int arr[]) {
//        int nz = 0;
//        int nt = arr.length - 1;
//        int i=0;
//
//        while(i<=nt){
//            if (arr[i] == 0) {
//                int temp = arr[i];
//                arr[i] = arr[nz];
//                arr[nz] = temp;
//                nz++;
//                i++;
//                //will move i and nz both as we know after swapping it have to be 1 at i
//
//            }
//            else if (arr[i] == 2) {
//                int temp = arr[i];
//                arr[i] = arr[nt];
//                arr[nt] = temp;
//                nt--;
//                //remember we will not move i, as we haven't process 2nd half of the array
//            }
//            else{
//                //when arr[i] is 1 , just move i++
//                i++;
//            }
//        }

        public static void main(String[] args) {
        int a[]={2,0,1,0,2};
        sort_num(a);
        for(int i:a)
        System.out.print(i+" ");
    }
}

