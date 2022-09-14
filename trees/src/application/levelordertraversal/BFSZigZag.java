package application.levelordertraversal;

import binarysearchtrees.algorithm.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class BFSZigZag {

    public ArrayList<ArrayList<Integer>> zigzagLevelOrderTraversal(BinaryTreeNode root) {
        ArrayList<ArrayList<Integer>> outputList = new ArrayList<>();
        LinkedList<BinaryTreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        boolean flip = false;

        while (!nodeQueue.isEmpty()) {
            int size = nodeQueue.size();

            ArrayList<Integer> output = new ArrayList<>();
            while (size-- > 0) {
                BinaryTreeNode currentNode = nodeQueue.pollFirst();
                output.add(currentNode.value);

                if (currentNode.left != null) {
                    nodeQueue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    nodeQueue.add(currentNode.right);
                }
            }

            if (flip) {
                Collections.reverse(output);
            }
            flip = !flip;

            outputList.add(output);
        }

        return outputList;
    }
}
