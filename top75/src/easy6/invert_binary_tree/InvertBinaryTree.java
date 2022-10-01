package easy6.invert_binary_tree;

import binarysearchtrees.algorithm.BinaryTreeNode;

import java.util.LinkedList;

public class InvertBinaryTree {
    public BinaryTreeNode invertTree(BinaryTreeNode root) {

        LinkedList<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.poll();

            BinaryTreeNode temp = current.right;
            current.right = current.left;
            current.left = temp;

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return root;
    }
}
