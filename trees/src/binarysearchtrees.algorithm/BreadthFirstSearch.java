package binarysearchtrees.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BreadthFirstSearch {

    public ArrayList<ArrayList<Integer>> getElementsByLevel(BinaryTreeNode root) {
        ArrayList<ArrayList<Integer>> outputList = new ArrayList<>();
        if (root == null) {
            return outputList;
        }

        LinkedList<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> output = new ArrayList<>();

            int iterations = queue.size();

            while(iterations-- > 0) {
                BinaryTreeNode currentNode = queue.pollFirst();
                output.add(currentNode.value);

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }

            outputList.add(output);
        }

        return outputList;
    }
}
