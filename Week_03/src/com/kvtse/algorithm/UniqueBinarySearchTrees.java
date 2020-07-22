package com.kvtse.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成二叉搜索树
 *
 * @author Tsing Tse
 * @date 2020-07-22 0:14
 */
public class UniqueBinarySearchTrees {
    public static void main(String[] args) {
        UniqueBinarySearchTrees uniqueBinarySearchTrees = new UniqueBinarySearchTrees();
        System.out.println(uniqueBinarySearchTrees.generateTrees(3));
    }

    /**
     * 生成二叉搜索树
     * 二叉搜索树:树的根节点大于其左子树的所有节点的值
     * @param n 生成有n个节点的树
     * @return
     */
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> ans = new ArrayList<>();
        if (n == 0) {
            return ans;
        }
        // 1-n 的每个节点都可以使根节点
        return getAns(1, n);

    }

    private List<TreeNode> getAns(int start, int end) {
        List<TreeNode> ans = new ArrayList<>();
        //此时没有数字，将 null 加入结果中
        if (start > end) {
            ans.add(null);
            return ans;
        }
        //只有一个数字，当前数字作为一棵树加入结果中
        if (start == end) {
            TreeNode tree = new TreeNode(start);
            ans.add(tree);
            return ans;
        }
        //尝试每个数字作为根节点
        for (int i = start; i <= end; i++) {
            //得到所有可能的左子树 二叉搜索树,左子树的值都比根节点小
            List<TreeNode> leftTrees = getAns(start, i - 1);
            //得到所有可能的右子树,二叉搜索树,右子树的值都比根节点大
            List<TreeNode> rightTrees = getAns(i + 1, end);
            //左子树右子树两两组合
            for (TreeNode leftTree : leftTrees) {
                for (TreeNode rightTree : rightTrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftTree;
                    root.right = rightTree;
                    //加入到最终结果中
                    ans.add(root);
                }
            }
        }
        return ans;
    }

    static class TreeNode{
        int val;
        /**
         * 左子树
         */
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val = val;
        }
        public  TreeNode(TreeNode left,TreeNode right ,int val){
            this.left = left;
            this.right = right;
            this.val = val;
        }
    }
}


