package com.kvtse.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 * @author Tsing Tse
 * @date 2020-07-20 0:34
 */
public class BinaryTreePreorderTraversal {

    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
//        return recursion(root);
        return iteration(root);
    }

    private List<Integer> iteration(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }

        Stack<TreeNode> stack = new Stack<>();
        // 前序遍历应该是放进去就弹出来
        stack.push(root);
        while (!stack.empty()){
            // 出栈元素
            TreeNode treeMode = stack.pop();
            res.add(treeMode.val);
            // 先压入右节点
            if (treeMode.right != null){
                stack.push(treeMode.right);
            }
            // 后压入左节点,下次循环先弹出左节点
            if (treeMode.left != null){
                stack.push(treeMode.left);
            }

        }

        return res;
    }

    /**
     * 递归实现数的前序遍历
     * @param root 根节点
     * @return
     */
    private List<Integer> recursion(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(res,root);
        return res;
    }

    private void dfs(List<Integer> res, TreeNode root) {
        if (root == null){
            return;
        }
        // 根左右,先打印根节点,在递归左子树
        res.add(root.val);
        dfs(res,root.left);
        dfs(res,root.right);
    }


}