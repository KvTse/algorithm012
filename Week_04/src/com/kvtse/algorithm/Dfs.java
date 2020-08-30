package com.kvtse.algorithm;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * 深度优先算法模板
 *
 * @author Tsing Tse
 * @date 2020-07-27 23:58
 */
public class Dfs {
    /**
     * 非递归的形式实现深度优先
     * @param root 根节点
     * @return 遍历值
     */
    private List<Integer> nonRecusion(TreeNode root){
        List<Integer> result = new ArrayList<>();
        // 申请一个栈结构用来记录是否还有子节点要遍历
        Stack<TreeNode> stack = new Stack<>();
        // 用来记录节点是否被访问过
        Set<TreeNode> visited = new HashSet<>();
        stack.push(root);
        visited.add(root);

        while (!stack.empty()){
            TreeNode pop = stack.pop();
            if (visited.contains(pop)) {
                continue;
            }
            visited.add(pop);
            TreeNode right = pop.right;
            result.add(pop.val);
            // 栈中压入右节点,后弹出
            if (right != null){
                stack.push(right);
            }
            TreeNode left = pop.left;
            // 栈中压入左节点,先弹出
            if (left != null){
                stack.push(left);
            }
        }
        return result;
    }


    /**
     * 深度优先算法模板
     * @param root 根节点
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> allResults = new ArrayList<>();
        if(root==null){
            return allResults;
        }
        travel(root,0,allResults);
        return allResults;
    }

    /**
     * results 二维集合
     * @param root 根节点
     * @param level 当前层级
     * @param results 结果集
     */
    private void travel(TreeNode root, int level, List<List<Integer>> results) {
        if (results.size() == level) {
            results.add(new ArrayList<>());
        }
        results.get(level).add(root.val);
        if (root.left != null){
            travel(root.left,level+1,results);
        }
        if (root.right != null){
            travel(root.right,level+1,results);
        }
    }

}
