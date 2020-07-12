package com.kvtse.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 爬楼梯问题:
 * 该问题主要是找到最小规律
 * https://leetcode-cn.com/problems/climbing-stairs/
 * @author Tsing Tse
 * @date 2020-07-12 19:49
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }

    private static int climbStairs(int n) {
        int[] cacheArray = new int[n+1];
        return climbStairs(n,cacheArray);
    }

    /**
     * 记忆化递归
     * @param n 参数n
     * @param cacheArray 缓存数组
     * @return 爬到n阶楼梯的方法
     */
    private static int climbStairs(int n, int[] cacheArray) {
        if (n <= 0){
            return 0;
        }
        if (cacheArray[n] > 0){
            return cacheArray[n];
        }
        if (n == 1){
            cacheArray[1] = 1;
        } else if (n == 2){
            cacheArray[2] = 2;
        }else {
            cacheArray[n] = climbStairs(n-1,cacheArray) + climbStairs(n-2,cacheArray);
        }
        return cacheArray[n];
    }
}
