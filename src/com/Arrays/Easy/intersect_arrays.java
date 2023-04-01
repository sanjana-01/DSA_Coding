package com.Arrays.Easy;
import java.util.*;
/*Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]*/
public class intersect_arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        //creating 1 set  and 1 arraylist
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        //Removing duplicates from firts array
        for(int i :nums1){
            set.add(i);
        }
        //now iterate in second array and , add in list whatever we found similar in set already ,
        //and once found keep removing from set as duplicates might come again in second array
        for(int i :nums2){
            if(set.contains(i)){
                list.add(i);
                set.remove(i);
            }
        }
        //copy whatever in list in array and return
        int[] output=new int[list.size()];
        for(int i=0; i < list.size();i++ ){
            output[i]=list.get(i);
        }
        return output;

    }

    public static void main(String[] args) {
        int a1[]={1,2,2,1},a2[]={1,2};
        int[] ans=intersection(a1,a2);
        System.out.println(ans);
    }
}
