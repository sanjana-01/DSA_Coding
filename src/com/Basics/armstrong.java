package com.Basics;

//For a given 3 digit number, find whether it is com.Basics.armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. Return "Yes" if it is a com.Basics.armstrong number else return "No".
//        NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371
//
//        Example 1:
//
//        Input: N = 153
//        Output: "Yes"
//        Explanation: 153 is an Armstrong number
//        since 13 + 53 + 33 = 153.
//        Hence answer is "Yes".
public class armstrong {
    static String armstrongNumber(int n){
        int num=n;
        int sum=0,r;
        while(n!=0){
            r=n%10;
            sum+=(r*r*r);
            n=n/10;
        }
        if(num==sum)
            return "Yes";
        else
            return "No";
    }

    public static void main(String[] args) {
        int a=153;
        System.out.println(armstrongNumber(a));
    }
}
