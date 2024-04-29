package com.Easycodes;
import java.util.*;
/*Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.



Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.*/
public class length_last_word {
    static int last_word(String s){
        int c=0;
        s=s.trim();                             // to remove trailing spaces
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){               //if we encounter space stop there
                break;
            }
            c++;                                //increment count
        }
        return c;
    }

    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
        System.out.println(last_word(s));
    }
}
