package com.Recursion;

//Given a string S, check if it is com.Basics.palindrome or not.
//
//        Example 1:
//
//        Input: S = "abba"
//        Output: 1
//        Explanation: S is a com.Basics.palindrome
public class palindrome {
    static int isPalindrome(String S) {
        // code here
        for(int i=0;i<S.length()/2;i++)
            if(S.charAt(i)!=S.charAt(S.length()-i-1))
                return 0;
        return 1;
    }

    public static void main(String[] args) {
        String s="madam";
        System.out.println(isPalindrome(s));
    }
}

