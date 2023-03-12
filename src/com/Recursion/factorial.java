package com.Recursion;
//A number N is called a factorial number if it is the factorial of a positive integer. For example, the first few factorial numbers are 1, 2, 6, 24, 120,
//        Given a number N, the task is to return the list/vector of the factorial numbers smaller than or equal to N.
//
//        Example 1:
//
//        Input: N = 3
//        Output: 1 2
//        Explanation: The first factorial number is
//        1 which is less than equal to N. The second
//        number is 2 which is less than equal to N,
//        but the third factorial number is 6 which
//        is greater than N. So we print only 1 and 2.
public class factorial{
    static long fact(long n){
        //base condition
        if(n==1)return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        long n=5;
        System.out.println(fact(n));
    }
}
