package com.Hashmaps;
import java.util.*;
/*Approach1 : check sum is 0 and increment the pointer O(n^2)
* Approach2 : by sorting .O(nlogn)*/
public class pair_sum {

//    static int sum_pair1(int[] arr){
//        int c=0,k,l;
//        for(int i=0;i<arr.length;i++){
//        for(int j=i+1;j<arr.length;j++){
//            if(arr[i]+arr[j]==0)
//                c++;
//        }
//        }
//        return c;
//    }

    static int sum_pair(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int c = 0;
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int totalCount=0;
        for (int i : arr) {
            int currentCount=0;
            if(map.containsKey(-i)) {
                //handling zero key case
                if (i == 0) {
                    int value = map.get(i);
                    currentCount = (value * (value  - 1)) / 2;          //count similar pair formula
                    totalCount=totalCount+currentCount;
                    map.put(i, 0);
                }
                //handling non zero cases
                currentCount=map.get(i)*map.get(-i);                  // pattern observation
                totalCount=totalCount+currentCount;
                map.put(i,0);                                         // reduce it to 0 as it considers in the next iteration
                map.put(-i,0);
            }
        }
        return totalCount;
    }

        public static void main(String[] args){
            int a[] = {2, 1, 2, -2, 3,0,0};
            System.out.println(sum_pair(a));
        }
    }

