package com.kvtse.algorithm;

/**
 * https://leetcode-cn.com/problems/climbing-stairs/
 *
 * @author Tsing Tse
 * @date 2020-07-21 0:44
 */
public class ClimbingStairsRecur {
    public static void main(String[] args) {
        int n = 4;
        int[] cacheArray = new int[n+1];
        System.out.println(climbingStairs(n, cacheArray));
    }

    /**
     * 空间复杂度O(n),时间复杂度O(n)
     * @param n n阶台阶
     * @param cacheArray 缓存台阶. i->表示第i阶台阶的cacheArray[i]中走法
     * @return 上n阶台阶的走法
     */
    private static int climbingStairs(int n ,int[] cacheArray){
        if (n<=0){
            return 0;
        }
        // 这一步是返回,之前已经计算过的台阶数
        if (cacheArray[n]>0){
            return cacheArray[n];
        }
        // 第一层只有一种走法,上一级台阶
        // 第二层,有两种走法, 1+1 或者直接2
        if (n == 1){
            cacheArray[1] = 1;
        } else  if (n == 2){
            cacheArray[2] = 2;
        }else{
            cacheArray[n] = climbingStairs(n-1,cacheArray)+climbingStairs(n-2,cacheArray);
        }
        return cacheArray[n];
    }

}
