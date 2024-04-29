package com.Easycodes;
/*You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG
*/
// Approach 1 : using stringbuilder , method called reverse
// Approach 2 : convert string to chararray swap the start(=0) and end(=n-1) elements
public class reverse_string {
     static String reverseWord(String str)
    {
        String s="";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);           //extracting each char from string
            s=ch+s;                     //add chars to empty string
        }
        return s;
    }

    public static void main(String[] args) {
    String s="sanju ";
        System.out.println(reverseWord(s));
    }
}
