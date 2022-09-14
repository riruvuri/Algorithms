package application.levelordertraversal;

import binarysearchtrees.algorithm.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class BinaryTreeRightView {
    static ArrayList<Integer> rightView(BinaryTreeNode root) {
        ArrayList<Integer> outputList = new ArrayList<>();
        LinkedList<BinaryTreeNode> queueNode = new LinkedList();
        queueNode.add(root);

        while (!queueNode.isEmpty()) {
            int size = queueNode.size();

            boolean rightNodeAdded = false;
            while (size-- > 0) {
                BinaryTreeNode currentNode = queueNode.pollFirst();
                if (!rightNodeAdded) {
                    outputList.add(currentNode.value);
                    rightNodeAdded = true;
                }

                if (currentNode.right != null) {
                    queueNode.add(currentNode.right);
                }

                if (currentNode.left != null) {
                    queueNode.add(currentNode.left);
                }
            }
        }

        return outputList;
    }
}
