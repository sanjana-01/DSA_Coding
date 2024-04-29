package com.Easycodes;
/*You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps*/
public class climbing_stairs {
        public static int climbStairs(int n) {
            if (n == 1) {
                return 1;
            }
            int[] dp = new int[n + 1];
            dp[1] = 1;
            dp[2] = 2;

            for (int i = 3; i <= n; i++) {      //you can either take a 1-step hop or a 2-step hop from the previous stair
                dp[i] = dp[i - 1] + dp[i - 2];
            }

            return dp[n];
        }

    public static void main(String[] args) {
            int n=4;
        System.out.println(climbStairs(n));
    }
}
