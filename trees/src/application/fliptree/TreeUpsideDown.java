package application.fliptree;

import binarysearchtrees.algorithm.BinaryTreeNode;
import com.sun.source.tree.BinaryTree;

/*
Flip tree upside down where the left most leaf node becomes the root, parent becomes the right child
and the right peer becomes the left child.
 */
public class TreeUpsideDown {
    public BinaryTreeNode flipTree(BinaryTreeNode root){
        BinaryTreeNode newRoot = helper(root);
        root.left = null;
        root.right = null;
        return newRoot;
    }

    private BinaryTreeNode helper(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }

        BinaryTreeNode newRoot = helper(root.left);
        root.left.left = root.right;
        root.left.right = root;
        return newRoot;
    }
}
