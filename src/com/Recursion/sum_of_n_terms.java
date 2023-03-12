package com.Recursion;

//Given and integer N.Calculate the sum of series 13 + 23 + 33 + 43 + … till N-th term.
//
//        Example 1:
//
//        Input:
//        N=5
//        Output:
//        225
//        Explanation:
//        13+23+33+43+53=225
public class sum_of_n_terms {
    static long sumOfSeries(long N) {
        // code here
        // long c=0;
        // for(int i=1;i<=N;i++)
        // c+=(i*i*i);
        // return c;

        if(N==0) return 0;
        return N*N*N+ sumOfSeries(N-1);
    }

    public static void main(String[] args) {
        long n=5;
        System.out.println(sumOfSeries(n));
    }
}
