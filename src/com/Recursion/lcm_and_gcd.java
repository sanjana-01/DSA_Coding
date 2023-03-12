//Given two numbers A and B. The task is to find out their LCM and GCD.
//        Example 1:
//
//        Input:
//        A = 5 , B = 10
//        Output:
//        10 5
//        Explanation:
//        LCM of 5 and 10 is 10, while
//        their GCD is 5.
package com.Recursion;
public class lcm_and_gcd {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long[] r=new Long[4];
        r[0]=lcm(A,B);
        r[1]=gcd(A,B);
        return r;
    }
    static Long gcd(Long A, Long B){
        if(B==0)
            return A;

        return gcd(B,A%B);
    }
    static Long lcm(Long A,Long B){
        return (A*B)/gcd(A,B);
    }

    public static void main(String[] args) {
        long A=10,B=5;
        System.out.println(lcmAndGcd(A,B));
    }
}
