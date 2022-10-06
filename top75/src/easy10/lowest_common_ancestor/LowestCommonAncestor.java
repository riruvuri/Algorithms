package easy10.lowest_common_ancestor;

import binarysearchtrees.algorithm.BinaryTreeNode;

public class LowestCommonAncestor {
    public BinaryTreeNode find(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
        if (root == null) {
            return  null;
        }

        return dfsHelper(root, p, q);
    }

    private BinaryTreeNode dfsHelper(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
        if (root.value == p.value || root.value == q.value) {
            return root;
        }

        BinaryTreeNode leftNode = null;
        if (root.left != null) {
            leftNode = dfsHelper(root.left, p, q);
        }

        BinaryTreeNode rightNode = null;
        if (root.right != null) {
            rightNode = dfsHelper(root.right, p, q);
        }

        if (leftNode != null && rightNode != null) {
            return root;
        }

        return leftNode != null ? leftNode : rightNode;
    }
}
