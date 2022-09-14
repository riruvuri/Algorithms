package application.depthfirstsearch.constructbst;

import binarysearchtrees.algorithm.BinaryTreeNode;

import java.util.ArrayList;

public class PreOrderTraversal {

    int idx = 0;
    public BinaryTreeNode createBst(ArrayList<Integer> preorder) {
        BinaryTreeNode root = bstHelper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return root;
    }

    BinaryTreeNode bstHelper(ArrayList<Integer> preorder, int lowerBound, int upperBound) {
        if (idx == preorder.size()
                || preorder.get(idx) > upperBound
                || preorder.get(idx) < lowerBound) {
            return null;
        }

        Integer currentElement = preorder.get(idx++);
        BinaryTreeNode node = new BinaryTreeNode(currentElement);
        node.left = bstHelper(preorder, lowerBound, currentElement);
        node.right = bstHelper(preorder, currentElement, upperBound);

        return node;
    }
}
