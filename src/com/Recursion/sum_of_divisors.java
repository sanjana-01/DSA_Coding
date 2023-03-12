package com.Recursion;

//Given a positive integer N., The task is to find the value of    \sum_{i=1}^{i=n} F(i)  where function F(i) for the number i be defined as the sum of all divisors of ‘i‘.
//
//        Example 1:
//
//        Input:
//        N = 4
//        Output:
//        15
//        Explanation:
//        F(1) = 1
//        F(2) = 1 + 2 = 3
//        F(3) = 1 + 3 = 4
//        F(4) = 1 + 2 + 4 = 7
//        ans = F(1) + F(2) + F(3) + F(4)
//        = 1 + 3 + 4 + 7
//        = 15
public class sum_of_divisors {
    static long sumOfDivisors(int N){
        // code here
        long sum = 0;
        long div = 0;
        for(int x=1;x<=N;x++){
            div = N/x;
            sum+=div*x;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(sumOfDivisors(n));
    }
}
