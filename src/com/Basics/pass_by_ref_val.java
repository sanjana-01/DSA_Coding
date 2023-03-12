package com.Basics;

//Geek is learning about functions and calling a function with arguments. He learns that passing can take one of two forms: pass by value or pass by reference.
//
//        Geek wishes to add 1 and 2, respectively, to the parameter passed by value and reference. Help Geek in fulfilling his goal.
//
//        Example 1:
//
//        Input:
//        a = 1
//        b = 2
//        Output:
//        2 4
//        Explanation: 1 was passed by value whereas 2 passed by reference.
public class passbyrefval {
    static int[] passedBy(int a, int b) {
        // code here
        int []r={a+1,b+2};
        return r;
    }

    public static void main(String[] args) {
        int a=30,b=40;
        System.out.println(passedBy(a,b));
    }
}
