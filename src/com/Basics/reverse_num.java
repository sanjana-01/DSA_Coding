package com.Basics;

//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//
//        Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//
//
//
//        Example 1:
//
//        Input: x = 123
//        Output: 321
public class reverse_num {
    public static int reverse(int x) {
        long rev=0;
        long r,l;
        while(x!=0){
            /* 2 power 31 to minus 2 power 31 range */
            if (rev > Integer.MAX_VALUE/10|| rev < Integer.MIN_VALUE/10)
            {
                return 0;
            }
            l=x%10;
            x=x/10;
            rev=(rev*10)+l;
        }
        return (int) rev;
    }

    public static void main(int[] args) {
        int a=123;
        System.out.println(reverse(a));
    }
}
