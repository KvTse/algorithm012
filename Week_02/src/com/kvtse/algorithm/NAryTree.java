package com.kvtse.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/description/
 * @author Tsing Tse
 * @date 2020-07-19 20:57
 */
public class NAryTree {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了96.28%的用户
     * @param root
     * @return
     */
    public List<Integer> preorder(Node root) {
        // 递归
        List<Integer> nodes = new ArrayList<>();
        dsf(nodes,root);
        return nodes;
    }
    private void dsf(List nodes,Node root){
        if (root == null){
            return;
        }
        nodes.add(root.val);
        List<Node> children = root.children;
        for (Node child : children) {
            dsf(nodes,child);
        }
    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
