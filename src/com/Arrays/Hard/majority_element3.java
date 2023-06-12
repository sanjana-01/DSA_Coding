package com.Arrays.Hard;
import java.util.*;
/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 3⌋ times.
You may assume that the majority element always exists in the array.
Example 1:

Input: nums = [3,2,3]
Output: 3
*/
public class majority_element3 {

        /* Brute Force
         Approach :
         Create a freq array then iterate over map and return the key which has value > n/3
         */
//        private static int majorityElement(int[] arr) {
//            int n=arr.length/3;
//            HashMap<Integer,Integer> map=new HashMap<>();
//            for(int i: arr){
//                map.put(i, map.getOrDefault(i,0)+1);
//            }
//
//            for(int i: map.keySet()){
//                if(map.get(i) > n){
//                    return i;
//                }
//            }
//            return -1;
//        }
//
        public static List<Integer> majorityElement(int[] nums) {
            int n1=0,n2=0,c1=0,c2=0;
            int n=nums.length;
            List<Integer> l=new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                if(n1==nums[i])             // we will have two variable for 2 nums and 2 counts
                                            // if ele is same as num[i] increment the count1
                    c1++;
                else if(n2==nums[i])
                    c2++;                   // if 2nd ele is same as num[i] increment the count2
                else if(c1==0){
                    c1=1;
                    n1=nums[i];             // if count is 0 make it as 1 and consider the next element as a new major element
                }
                else if(c2==0 ){
                    c2=1;
                    n2=nums[i];             // if count2 is 0 make it as 1 and consider the next element as a new major element
                }

                else{
                    c1--;
                    c2--;                   // decrement counts
                }
            }

            c1=0;
            c2=0;
            for(int i=0;i<n;i++){
                if(n1==nums[i])             // if it's same element increment count
                    c1++;
                else if(n2==nums[i])
                    c2++;
            }
            if(c1>n/3)                      // check if it's greater than n/3
                l.add(n1);
            if(c2>n/3)
                l.add(n2);                 // add elements in the list
            return l;
        }
        public static void main(String[] args) {
        int arr[]={2,1,1,3,1,4,5,6};
        List<Integer> a=majorityElement(arr);
        for(int i:a)
        System.out.print(i+" ");
    }
}

//2 1 1 3 1 4 5 6
//c1=0
//c2=0


