package application.depthfirstsearch.constructbst;

import binarysearchtrees.algorithm.BinaryTreeNode;

import java.util.ArrayList;

public class PreOrderTraversalAlt {
    public BinaryTreeNode createBst(ArrayList<Integer> preorder) {
        BinaryTreeNode root = bstHelper(preorder, 0, preorder.size() - 1);
        return root;
    }

    BinaryTreeNode bstHelper(ArrayList<Integer> preorder, int start, int end) {
        if (start > end) {
            return null;
        }

        Integer currentElement = preorder.get(start);
        BinaryTreeNode node = new BinaryTreeNode(currentElement);

        int index = -1;
        if (preorder.get(start) < preorder.get(end)) {
            for (int i=start+1; i<=end; i++) {
                if (preorder.get(i) > currentElement) {
                    index = i;
                    break;
                }
            }
        }

        // It  means all elements are on the left subtree
        if (index == -1) {
            node.left = bstHelper(preorder, start+1, end);
        } else {
            node.left = bstHelper(preorder, start+1, index-1);
            node.right= bstHelper(preorder, index, end);
        }

        return node;
    }
}
