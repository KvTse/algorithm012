package com.kvtse.algorithm;

/**
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 *
 * @author Tsing Tse
 * @date 2020-07-21 1:16
 */
public class TwoSumInSortArray {

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;

        twoSum(numbers,target);

    }

    /**
     * 1.暴力,两层循环  O(n^2)
     * 2.因为有序,二分法去掉一半数据 O(n*logN)
     * 3.双指针 时间O(n) 空间O(1)
     * @param numbers 源数组
     * @param target 目标值
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        int lowIndex = 0;
        int highIndex = numbers.length-1;
        while(lowIndex<highIndex){
            if (numbers[lowIndex]+numbers[highIndex] == target) {
                return new int[]{++lowIndex,++highIndex};
            }
            // 右边大了
            if (numbers[lowIndex] + numbers[highIndex] > target) {
                highIndex--;
            }else {
                lowIndex ++;
            }
        }
        return new int[]{-1,-1};
    }

}
