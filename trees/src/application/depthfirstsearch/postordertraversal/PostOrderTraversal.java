package application.depthfirstsearch.postordertraversal;

import binarysearchtrees.algorithm.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class PostOrderTraversal {
    static ArrayList<Integer> postorder_traversal(BinaryTreeNode root) {
        ArrayList<Integer> outputList = new ArrayList<Integer>();
        Stack<BinaryTreeNode> slate = new Stack<>();
        if (root != null) {
            slate.push(root);
        }

        while (!slate.isEmpty()) {
            BinaryTreeNode currentNode = slate.pop();
            outputList.add(currentNode.value);

            if (currentNode.left != null) {
                slate.push(currentNode.left);
            }

            if (currentNode.right != null) {
                slate.push(currentNode.right);
            }
        }

        Collections.reverse(outputList);
        return outputList;
    }
}

