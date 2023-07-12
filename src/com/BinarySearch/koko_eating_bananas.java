package com.BinarySearch;
/*Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile.
If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours.
Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30
*/
public class koko_eating_bananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=-1;
        int k=0;
        // find max element
        for(int i:piles){
            high=Integer.max(high,i);
        }

        while( low < high){
            int mid=(low+high)/2;
            k=0;
            for(int val:piles){
                //total timing when each piles were eaten in m per hour
                k+=Math.ceil((double)val/mid);
            }
            //check whether the total timing is less than h if it is then   keep high = m
            //if m is answer than m+1 definetly the answer but m-1 may or may not be the answer
            //so always keep high as m
            if(k <= h) high=mid;
                // if  it takes time greater than h then move l to m+1
            else low=mid+1;
        }
        return high;
    }

    public static void main(String[] args) {
        int arr[] ={3,6,7,11};                      //min is 4 so it strts from 4
        int h=8;
        System.out.println(minEatingSpeed(arr,h));
    }
}
