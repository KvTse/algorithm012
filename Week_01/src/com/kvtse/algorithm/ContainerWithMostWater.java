package com.kvtse.algorithm;

/**
 * 盛水最多的容器
 * https://leetcode-cn.com/problems/container-with-most-water/
 * @author Tsing Tse
 * @date 2020-07-12 19:16
 */
public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = new int[]{1,2,3,4,5,6,7};
        System.out.println(maxArea(height));
    }

    /**
     * 求给定数组与其下标的乘积的最大值
     * @param height 柱子高度
     * @return 最大面积
     */
    private static int maxArea(int[] height){
        int maxArea = 0;
        // 参数检查
        if (height == null || height.length <= 1){
            return maxArea;
        }
        // 双指针法 左右两边同时移动指针
        int left = 0;
        int right = height.length -1;
        while (left < right){
            // 这写法简直 优美了
            maxArea = height[left] < height[right] ?
                    Math.max(maxArea, (right - left) * height[left++]):
                    Math.max(maxArea, (right - left) * height[right--]);

//            int area ;
//            // 右边比左边高,需要移动左边元素 左边右移
//            if (height[left] < height[right]){
//                area = (right-left) * height[left];
//                left ++;
//            }else {
//                // 左边比右边高,需要移动右边元素,右边左移
//
//                area = (right - left) * height[right];
//                right--;
//            }
//            maxArea = Math.max(area,maxArea);
        }

        return maxArea;
    }
}
