package com.dp.onedimensiondp.strings;
import java.util.*;

public class wildcharmatching {
     // Helper function to check if all characters from index 1 to i in S1 are '*'
        static boolean isAllStars(String S1, int i) {
            for (int j = 1; j <= i; j++) {
                if (S1.charAt(j - 1) != '*')
                    return false;
            }
            return true;
        }

        // Function to perform wildcard pattern matching
        static boolean wildcardMatching(String S1, String S2) {
            int n = S1.length();
            int m = S2.length();

            // Create a 2D array to store the matching results
            boolean dp[][] = new boolean[n + 1][m + 1];
            dp[0][0] = true;

            // Initialize the first row and column based on wildcard '*' in S1
            for (int j = 1; j <= m; j++) {
                dp[0][j] = false;
            }
            for (int i = 1; i <= n; i++) {
                dp[i][0] = isAllStars(S1, i);
            }

            // Fill the dp array using a bottom-up approach
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (S1.charAt(i - 1) == S2.charAt(j - 1) || S1.charAt(i - 1) == '?') {
                        dp[i][j] = dp[i - 1][j - 1]; // Characters match or '?' is encountered.
                    } else {
                        if (S1.charAt(i - 1) == '*') {
                            dp[i][j] = dp[i - 1][j] || dp[i][j - 1]; // '*' matches one or more characters.
                        } else {
                            dp[i][j] = false; // Characters don't match, and S1[i-1] is not '*'.
                        }
                    }
                }
            }

            return dp[n][m]; // The final result indicates whether S1 matches S2.
        }

        public static void main(String args[]) {
            String S1 = "ab*cd";
            String S2 = "abdefcd";

            if (wildcardMatching(S1, S2)) {
                System.out.println("String S1 and S2 do match");
            } else {
                System.out.println("String S1 and S2 do not match");
            }
        }
    }
