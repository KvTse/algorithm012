package com.kvtse.algorithm;

/**
 * https://leetcode-cn.com/problems/minimum-path-sum
 *
 * @author Tsing Tse
 * @date 2020-07-23 2:08
 */
public class MinimumPathSum {
    /**
     * 走到当前步骤的时候,都根据前面的操作结果,选取当前最优解
     * dp 时间复杂度O(nm) 空间复杂度 O(1)
     *
     * @param grid
     * @return
     * [
     * [1 2 3]
     * [4 5 6]
     * [7 8 9]
     * ]
     */
    public int minPathSum(int[][] grid) {
        // 边界条件
        // 二维数组遍历
        // 相当于列长度
        for(int i = 0 ;i<grid.length;i++){
            // 相当于行长度
            for(int j = 0 ;j<grid[0].length;j++){
                if(i == 0 && j == 0){
                    continue;
                }
                if(i==0 ){
                    grid[0][j] = grid[0][j-1]+grid[0][j];
                }else if(j == 0){
                    grid[i][0] = grid[i-1][0]+grid[i][j];
                }else{
                    grid[i][j] =  Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
                }

            }
        }
        return grid[grid.length-1][grid[0].length-1];

    }
}
