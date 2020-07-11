package com.kvtse.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数求和
 * https://leetcode-cn.com/problems/two-sum/
 * @author Tsing Tse
 * @date 2020-07-11 19:01
 */
public class TwoSum {
    public static void main(String[] args) {

    }
    private int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> tempMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (tempMap.containsKey(target - nums[i])){
                return new int[]{tempMap.get(target - nums[i]),i};
            }
            tempMap.put(nums[i],i);
        }

        return null;
    }
}
