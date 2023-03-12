package com.Sorting;
/*A sorting technique where list is divided into 2. left is sorted and right is unsorted.
we select the smallest element from unsorted list and place it in sorted list.(for ascending order)
if not largest element needs to be selected if descending
Time complexity - O(n^2)
* */
public class selection_sort {
    static void sel_sort(int[] arr) {
        int size = arr.length;
        int temp = 0;

        for (int i = 0; i < size-2; i++) {
            int min_value = i;                  //assume min value is i (first elem of current iteration)

            for (int j = i + 1; j < size; j++) {

                if (arr[j] < arr[i])
                    min_value = j;              //make j as min value if a[j] is less

            }
            temp = arr[min_value];            //swap min_value array and arr[i] to get sorted array
            arr[min_value] = arr[i];
            arr[i] = temp;
        }
    }


    public static void main(String[] args) {
        int a[]={10,2,5,3,1,0};
        sel_sort(a);
        for(int i:a)
            System.out.print(i+" ");
    }
}
