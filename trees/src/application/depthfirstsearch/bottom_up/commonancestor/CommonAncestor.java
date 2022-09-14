package application.depthfirstsearch.bottom_up.commonancestor;

import binarysearchtrees.algorithm.BinaryTreeNode;

public class CommonAncestor {
    static Integer lca(BinaryTreeNode root, BinaryTreeNode a, BinaryTreeNode b) {

        BinaryTreeNode node = dfsAncesstorHelper(root, a, b);

        return node.value;
    }

    static BinaryTreeNode dfsAncesstorHelper(BinaryTreeNode root, BinaryTreeNode a, BinaryTreeNode b) {
        if (root.value.equals(a.value) || root.value.equals(b.value)) {
            return root;
        }

        BinaryTreeNode leftNode = null;
        if (root.left != null) {
            leftNode = dfsAncesstorHelper(root.left, a, b);
        }

        BinaryTreeNode rightNode = null;
        if (root.right != null) {
            rightNode = dfsAncesstorHelper(root.right, a, b);
        }

        if (leftNode != null && rightNode != null) {
            return root;
        }

        return leftNode != null ? leftNode : rightNode;
    }
}
