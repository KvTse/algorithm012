package com.kvtse.algorithm;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode-cn.com/problems/merge-intervals/solution/
 *
 * @author Tsing Tse
 * @date 2020-08-30 15:17
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        // [[1,3],[2,6],[8,10],[15,18]]
        // 1.首先将参数数组排序 nlogn
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        int[][] res = new int[intervals.length][2];
        int index = -1;
        // 2. 合并逻辑
        for (int[] interval : intervals) {
            // 第一个元素时,后续数组中第一个元素大于前一个数组的最后一个元素时,不用合并
            if (index == -1 || res[index][1] < interval[0]){
                res[++index] = interval;
            }else{
                // 需要合并,当前res数组中的最后一个元素替换成此次遍历中最后一个位中较大的元素
                // 这一步也能解决后一个数组的元素时前一个数组元素的子集的问题
                res[index][1] = Math.max(res[index][1],interval[1]);
            }
        }
        // 如果存在合并,res后续存在空,需要将非空的元素拷贝出来
        return Arrays.copyOf(res,index+1);
    }

}
