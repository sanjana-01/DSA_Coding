package com.Easycodes;
/*You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
*/
public class plus_one {
    static int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){            //if less than 9 simply add
                digits[i]++;
                return digits;
            }
            digits[i]=0;                // if there is 9 we get 0
        }
        digits =new int[n+1];           // if there is 9,9,9, should be 1,0,0,0, so for this case we are making first index as 1
        digits[0]=1;
        return digits;
    }

    public static void main(String[] args) {
        int a[]={1,2,1};
        System.out.println(plusOne(a));
    }
}
