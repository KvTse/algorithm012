package com.kvtse.algorithm;

/**
 * 零移动
 * https://leetcode-cn.com/problems/move-zeroes/
 * @author Tsing Tse
 * @date 2020-07-11 17:45
 */
public class ZeroMove {

    public static void main(String[] args) {

        int[] nums = new int[]{1,0,3,0,2,29,0};
//        moveZeroes(nums);
        moveZeroesWithOneLoop(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    /**
     * 一次循环移动非0元素
     * @param nums 待操作数组
     */
    private static void moveZeroesWithOneLoop(int[] nums){
        if(nums == null || nums.length == 0 || nums.length == 1){
            return;
        }
        // 借鉴快排算法思想,将非0元素放置数组左边
        int j = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] != 0 ){
                // 取出非零元素
                int tmp = nums[i];
                // 将j元素的值赋值给i
                nums[i] = nums[j];
                // j ++
                nums[j++] = tmp;
            }
        }
    }

    private static void moveZeroes(int[] nums) {
        if(nums == null || nums.length==0){
            return;
        }
        int nonZeroCount = 0;
        for(int i = 0 ; i< nums.length;i++){
            // 每取出一个非0元素,顺序赋值给原数组
            if(nums[i] != 0){
                nums[nonZeroCount] = nums[i];
                nonZeroCount++;
            }
        }
        for(int i = nonZeroCount;i < nums.length;i++){
            // 将非零后的数组元素都置为0
            nums[i] = 0;
        }
    }
}
