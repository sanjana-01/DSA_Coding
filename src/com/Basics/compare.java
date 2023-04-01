package com.Basics;//Given two integers, n and m. The task is to check the relation between n and m.
//
//        Example 1:
//
//        Input:
//        n = 4
//        m = 8
//
//        Output:
//        lesser
//
//        Explanation:
//        4 < 8 so print 'lesser'.

public class compare {
    static String compareNM(int n, int m) {
        // code here
        if (n < m)
            return "lesser";
        else if (n > m)
            return "greater";
        else
            return "equal";

    }

    public static void main(String[] args) {
        int n=3,m=4;
        System.out.println(compareNM(n,m));
    }
}
