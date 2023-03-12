package com.Hashmaps;
import java.util.*;
/*Approach 1 : using set - define set and run for loop ,add each elements into set as it takes distinct values. O(n)
* Approach 2 : by sorting O(nlogn)
* Approach 3 : creating temp array to store unique, traverse array and keep unique in temp O(n)
* */
public class remove_duplicates {
    static ArrayList<Integer> removeduplicates(int[] arr) {
        ArrayList<Integer>r=new ArrayList<>();  //arraylist to store final array
        HashMap<Integer,Boolean> h=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(h.containsKey(arr[i]))
                continue;
            r.add(arr[i]);
            h.put(arr[i],true);
        }
        return r;
    }
    public static void main(String[] args) {
        int a[]={1,2,2,3,5,5};
        System.out.println(removeduplicates(a));
    }
}
