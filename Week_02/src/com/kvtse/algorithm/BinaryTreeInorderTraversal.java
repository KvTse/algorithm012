package com.kvtse.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 *
 * @author Tsing Tse
 * @date 2020-07-19 21:11
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        return recursion(root);
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
  }