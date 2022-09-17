package application.circularlinkedlist;

import binarysearchtrees.algorithm.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

/*
Convert binary tree to circular linked list
 */
public class BinaryTreeToLinkedList {
    public BinaryTreeNode convertToCircularLinkedList(BinaryTreeNode root) {
        List<BinaryTreeNode> inorderList = new ArrayList<>();
        prepareInorderList(root, inorderList);

        BinaryTreeNode newCircularLL = inorderList.get(0);
        for (int i=1; i < inorderList.size() - 1; i++) {
            inorderList.get(i-1).right = inorderList.get(i);
            inorderList.get(i).left = inorderList.get(i-1);
            inorderList.get(i).right = inorderList.get(i+1);
            inorderList.get(i+1).left = inorderList.get(i);
        }
        BinaryTreeNode lastNode = inorderList.get(inorderList.size()-1);
        BinaryTreeNode firstNode = inorderList.get(0);
        lastNode.right=firstNode;
        firstNode.left=lastNode;

        return firstNode;
    }

    private void prepareInorderList(BinaryTreeNode root, List<BinaryTreeNode> inorderList) {
        if (root.left != null) {
            prepareInorderList(root.left, inorderList);
        }
        inorderList.add(root);
        if (root.right != null) {
            prepareInorderList(root.right, inorderList);
        }
    }
}
