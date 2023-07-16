package com.Graphs.Basics;
/*Given an integer n representing number of vertices. Find out how many undirected graphs (not necessarily connected) can be constructed out of
a given n number of vertices.

Input: 2
Output: 2*/
public class counting_graphs {
    static long count(int n) {
        // code here
        long k = (long)((n*(n-1))/2);               //formula
        return (long)Math.pow(2,k);
    }

    public static void main(String[] args) {
        int n=2;
        System.out.println(count(n));
    }
}
