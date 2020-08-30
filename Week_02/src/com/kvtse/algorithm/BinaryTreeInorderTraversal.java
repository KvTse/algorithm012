package com.kvtse.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 *
 * @author Tsing Tse
 * @date 2020-07-19 21:11
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
//        return recursion(root);
        return iteration(root);
    }

    /**
     * 时间复杂度 O(n)
     * 迭代方法
     * @param root 根节点
     * @return
     */
    private List<Integer> iteration(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        // stack.size = 0 && root == null 时,退出迭代
        while(stack.size() >0 || root != null){
            if (root != null){
                // 将做节点压入栈中
                stack.add(root);
                root = root.left;
            }else{
                // 根节点为空了,说明节点已经遍历完成
                // 需要从stack中弹出元素
                TreeNode tmpNode = stack.pop();
                res.add(tmpNode.val);
                root = tmpNode.right;
            }
        }
        return res;
    }

    /**
     * 递归,记住树的中序,模板代码
     * @param root 根节点
     * @return
     */
    private List<Integer> recursion(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(res,root);
        return res;
    }

    void dfs(List<Integer> res, TreeNode root) {
        if(root==null) {
            return;
        }
        //按照 左-打印-右的方式遍历
        dfs(res,root.left);
        res.add(root.val);
        dfs(res,root.right);
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