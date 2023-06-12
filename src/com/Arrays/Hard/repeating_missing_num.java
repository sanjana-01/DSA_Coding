package com.Arrays.Hard;
import java.util.*;
/*Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers.

Example 1:

Input:
N = 2
Arr[] = {2, 2}
Output: 2 1
Explanation: Repeating number is 2 and
smallest positive missing number is 1.

Approach 1: initially make all elements as 0 and then traverse through each element and increment each elements freq
--whose freq is more is repeating and whose freq is 0 is missing number.
int[] a=new int[n];
for(i=0 to n) a[i]=0
for(i=0 to n)a[array.get(i)]++
for(i=1 to n) if(a[i]==0|| a[i]>1) ans.add(i)

time complexity is O(n) space is O(n)

Approach 2: using hashmap , from freq hashmap whose freq is 0 is the missing num and whose freq is more is repeating num

Approach 3: using set. Time complexity is O(n)+O(n)~O(n). space is O(n)

*/
public class repeating_missing_num {
//    static int[] findTwoElement(int arr[], int n) {
//        // code here
//        HashSet<Integer> set = new HashSet<>();
//        int ans[] = new int[2];
//        for (int i = 0; i < n; i++) {
//            if (!set.contains(arr[i])) {                 // distinct elements needs to be added in the set
//                set.add(arr[i]);
//            } else
//                ans[0] = arr[i];                         // repeated elements into first index of array
//        }
//
//        for (int i = 1; i <= n; i++) {
//            if (!set.contains(i)) {                       // if particular element is not in the set is placed into first index of array
//                ans[1] = i;
//            }
//        }
//        return ans;
//    }
static int[] findTwoElement(int[] arr, int n) {
    int [] result = new int [2];

    HashMap<Integer,Integer> map = new HashMap<>();

for(int i=0;i<n;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    }

for(int i=1;i<=n;i++){
//means that i is not present
        if(map.get(i)==0){
            result[1] = i;
        }
        if(map.get(i) > 1){
            result[0] = i;
        }
    }

return result;
}


        public static void main (String[] args){
            int[] a = {2, 2, 1, 2, 4, 5};
            int n = 6;
            int[] ans = findTwoElement(a, n);
            for (int i : ans) {
                System.out.println(i + " ");
            }
        }
    }
