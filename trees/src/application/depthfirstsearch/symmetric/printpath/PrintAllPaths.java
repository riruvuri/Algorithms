package application.depthfirstsearch.symmetric.printpath;

import binarysearchtrees.algorithm.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class PrintAllPaths {
    static ArrayList<ArrayList<Integer>> all_paths_of_a_binary_tree(BinaryTreeNode root) {
        Stack<Integer> slate = new Stack<>();
        ArrayList<ArrayList<Integer>> outputList = new ArrayList<>();

        if (root != null) {
            pathHelper(root, slate, outputList);
        }

        return outputList;
    }

    static void pathHelper(BinaryTreeNode root, Stack<Integer> slate,
                           ArrayList<ArrayList<Integer>> outputList) {

        slate.add(root.value);

        // Leaf
        if (root.left == null && root.right == null) {
            // Add the slate to output
            outputList.add(new ArrayList<>(slate.stream().toList()));
            return;
        }

        if (root.left != null) {
            pathHelper(root.left, slate, outputList);
            slate.pop();
        }

        if (root.right != null) {
            pathHelper(root.right, slate, outputList);
            slate.pop();
        }
    }
}
