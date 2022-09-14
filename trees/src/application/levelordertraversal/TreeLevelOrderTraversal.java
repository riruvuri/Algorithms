package application.levelordertraversal;

import binarysearchtrees.algorithm.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreeLevelOrderTraversal {

    static ArrayList<ArrayList<Integer>> levelOrderTraversal(TreeNode root) {
        ArrayList<ArrayList<Integer>> outputList = new ArrayList<>();
        LinkedList<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            int size = nodeQueue.size();

            ArrayList<Integer> output = new ArrayList<>();
            while (size-- > 0) {
                TreeNode node = nodeQueue.pollFirst();
                output.add(node.value);

                List<TreeNode> children = node.children;
                if (children != null && !children.isEmpty()) {
                    for (TreeNode child : children) {
                        nodeQueue.add(child);
                    }
                }
            }

            outputList.add(output);
        }

        return outputList;
    }
}
