package com.Easycodes;

public class move_neg_to_rightend {
        static int[] move1(int[] arr,int n){
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                while (left < right && arr[left] >= 0) {        // Find the next negative element from the left
                    left++;
                }
                while (left < right && arr[right] < 0) {         // Find the next positive element from the right
                    right--;
                }
                if (left < right) {                          // Swap the negative element on the left with the positive element on the right
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
            }
            return arr;
        }

        public static void main(String[] args) {
            int a[]={1, -1, 3, 2, -7, -5, 11, 6};
            int n=8;
            move1(a,n);
            for(int i:a)
                System.out.print((i)+" ");
        }
    }

