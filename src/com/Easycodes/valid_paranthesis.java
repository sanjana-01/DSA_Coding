package com.Easycodes;
/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:

Input: s = "()"
Output: true*/
// Approach 1 :using stack push and pop.
public class valid_paranthesis {
    public static boolean isValid(String s) {
        int count1 = 0, count2 = 0, count3 = 0; // count of (, [, {

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count1++;
            } else if (c == ')') {
                count1--;
            } else if (c == '[') {
                count2++;
            } else if (c == ']') {
                count2--;
            } else if (c == '{') {
                count3++;
            } else if (c == '}') {
                count3--;
            }

            if (count1 < 0 || count2 < 0 || count3 < 0) {
                return false; // more closing than opening parentheses
            }
        }

        return (count1 == 0 && count2 == 0 && count3 == 0); // all parentheses closed
    }

    public static void main(String[] args) {
        String s = "()[{}";
        boolean valid = isValid(s);
        System.out.println( (valid ? "valid" : "invalid"));
    }
}


