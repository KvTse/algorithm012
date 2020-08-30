package com.kvtse.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 广度优先
 *
 * @author Tsing Tse
 * @date 2020-07-28 10:06
 */
public class Bfs {
    /**
     * 广度优先搜索
     * @param root 根节点
     * @return 遍历结果
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if (root == null){
            return results;
        }
        // 广度优先维护一个队列,先进先出.
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()){
            int size = treeNodes.size();
            List<Integer> currentNodeVal = new ArrayList<>();
            // 当前层节点数据在此循环中处理,取值并收集子节点,待收集完子节点后再次进入循环
            // 之后再遍历每个子节点的值
            for (int i = 0;i<size;i++){
                // 节点
                TreeNode currentNode = treeNodes.poll();
                currentNodeVal.add(currentNode.val);
                TreeNode left = currentNode.left;
                if (left != null){
                    treeNodes.add(left);
                }
                TreeNode right = currentNode.right;
                if (right != null){
                    treeNodes.add(right);
                }
            }
            results.add(currentNodeVal);
        }
        return results;
    }
}
