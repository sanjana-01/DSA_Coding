package com.dp.onedimensiondp.stocks;


/*You are given an integer array prices where prices[i] is the price of a given stock on the ith day, and an integer k.

        Find the maximum profit you can achieve. You may complete at most k transactions: i.e. you may buy at most k times and sell at most k times.

        Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).



        Example 1:

        Input: k = 2, prices = [2,4,1]
        Output: 2
        Explanation: Buy on day 1 (price = 2) and sell on day 2 (price = 4), profit = 4-2 = 2.
        Example 2:

        Input: k = 2, prices = [3,2,6,5,0,3]
        Output: 7
        Explanation: Buy on day 2 (price = 2) and sell on day 3 (price = 6), profit = 6-2 = 4.
        Then buy on day 5 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.*/

public class buysellstock_4 {

        public int maxProfitTabulation(int k, int[] prices) {

            int n = prices.length;
            int[][][] dp=new int[n+1][2][k+1];

            for(int index=n-1;index>=0;index--){
                for(int buy=0;buy<=1;buy++){
                    for(int cap=1;cap<=k;cap++){ //cap started from 1 because 0 is a base case which means no transaction allowed
                        int profit=0;
                        if (buy==1) {

                            profit = Math.max(-prices[index] + dp[index + 1][0][cap],
                                    0 + dp[index + 1][1][cap]);
                        } else {

                            profit = Math.max(prices[index] + dp[index + 1][ 1][cap-1],
                                    0 + dp[index + 1][0][cap]);
                        }
                        dp[index][buy][cap]=profit;
                    }

                }

            }
            return dp[0][1][k];
        }

        public static void main(String[] args) {
        }
    }
}
