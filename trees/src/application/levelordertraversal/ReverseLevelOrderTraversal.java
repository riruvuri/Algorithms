package application.levelordertraversal;

import binarysearchtrees.algorithm.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> reverseLevelOrderTraversal(BinaryTreeNode root) {
        ArrayList<ArrayList<Integer>> outputList = new ArrayList<>();
        LinkedList<BinaryTreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            int count = nodeQueue.size();

            ArrayList<Integer> output = new ArrayList<>();
            while(count-- > 0) {
                BinaryTreeNode current = nodeQueue.pollFirst();
                output.add(current.value);

                if (current.left != null) {
                    nodeQueue.add(current.left);
                }

                if (current.right != null) {
                    nodeQueue.add(current.right);
                }
            }
            outputList.add(output);
        }
        Collections.reverse(outputList);
        return outputList;
    }
}
