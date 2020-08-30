package com.kvtse.algorithm.daily;

/**
 * https://leetcode-cn.com/problems/integer-break/solution/zheng-shu-chai-fen-by-leetcode-solution/
 *
 * @author Tsing Tse
 * @date 2020-07-30 23:09
 */
public class IntegerPartition {
    public static void main(String[] args) {
        System.out.println(integerBreak(4));
    }
    public static int integerBreak(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }
}
