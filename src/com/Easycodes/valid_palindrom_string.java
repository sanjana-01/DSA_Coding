package com.Easycodes;
/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.*/
//Approach 1 : 2 pointer approach - maintain left and right pointer compare them and increment left and decrement right
public class valid_palindrom_string {

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        // Remove non-alphanumeric characters
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        int n = s.length();
        for (int i = 0; i < n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
