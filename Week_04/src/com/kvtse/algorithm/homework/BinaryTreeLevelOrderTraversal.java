package com.kvtse.algorithm.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的层序遍历,即为树的深度优先遍历.
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 *
 * @author Tsing Tse
 * @date 2020-07-28 10:32
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if (root == null){
            return results;
        }
        // 利用队列的先进先出FIFO特性,每次可以处理完成当前一层的节点
        Queue<TreeNode> treeNodesQueue = new LinkedList<>();
        treeNodesQueue.add(root);
        while (!treeNodesQueue.isEmpty()){
            // 看当前层级中有多少个节点数据
            int currentLevelNodeSize = treeNodesQueue.size();
            // 新开一个集合存储当前层级节点的值
            List<Integer> currentLevelNodeVal = new ArrayList<>();
            for (int i = 0; i < currentLevelNodeSize; i++) {
                // 这里的逻辑不要管循环的事情,只顾从链表中弹出数据即可
                TreeNode currentNode = treeNodesQueue.poll();
                currentLevelNodeVal.add(currentNode.val);
                TreeNode left = currentNode.left;
                TreeNode right = currentNode.right;
                if (left != null){
                    treeNodesQueue.add(left);
                }
                if (right != null){
                    treeNodesQueue.add(right);
                }
            }
            results.add(currentLevelNodeVal);
        }
        return results;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}