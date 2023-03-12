package com.Hashmaps;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

//Extract Unique characters
//
//        Given a string S, you need to remove all the duplicates. T
//        hat means, the output string should contain each character only once.
//        The respective order of characters should remain same, as in the input string.
//        Input format:
//        The first and only line of input contains a string, that denotes the value of S.
//        Output format :
//        The first and only line of output contains the updated string, as described in the task.
//        Constraints :
//        0 <= Length of S <= 10^8
//        Time Limit: 1 sec
//        Sample Input 1 :
//        ababacd
//        Sample Output 1 :
//        abcd
//        Sample Input 2 :
//        abcde
//        Sample Output 2 :
//        abcde
public class extract_unique_chars {
static String getuniquechar(String s) {
    HashMap<Character, Boolean> h = new HashMap<>();
    String str = "";
    for (int i = 1; i <= s.length(); i++) {
        if (h.containsKey(s.charAt(i)))
            continue;
        str = str + s.charAt(i);
        h.put(s.charAt(i), true);
    }
    return str;
}
    public static void main(String[] args) {
        String s="ababad";
        System.out.println(getuniquechar(s));
    }
}
