package binarysearchtrees.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class BSTHelper {

    public BinaryTreeNode createBST(Integer[] input) {
        return createBSTHelper(input, 0, input.length- 1);

    }

    private BinaryTreeNode createBSTHelper(Integer[] input, int start, int end) {
        if (start > end) {
            return null;
        }

        // Leaf node
        if (start == end) {
            return new BinaryTreeNode(input[start]);
        }

        int middle = start + (end - start)/2;
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode(input[middle]);
        binaryTreeNode.left = createBSTHelper(input, start, middle-1);
        binaryTreeNode.right = createBSTHelper(input, middle+1, end);

        return binaryTreeNode;
    }


    /*
    Stackoverflow: https://stackoverflow.com/questions/37941318/how-to-build-an-incomplete-binary-tree-from-array-representation
     */
    public BinaryTreeNode createLevelOrderBinaryTree(Integer[] input) {
        if (input == null || input.length == 0) {
            return null;
        }

        Queue<BinaryTreeNode> treeNodeQueue = new LinkedList<>();
        Queue<Integer> inputQueue = new LinkedList<>();
        for (int i = 1; i < input.length; i++) {
            inputQueue.offer(input[i]);
        }

        BinaryTreeNode rootNode = new BinaryTreeNode(input[0]);
        treeNodeQueue.offer(rootNode);

        while (!inputQueue.isEmpty()){
            Integer leftVal = inputQueue.isEmpty() ? null : inputQueue.poll();
            Integer rightVal = inputQueue.isEmpty() ? null : inputQueue.poll();
            BinaryTreeNode current = treeNodeQueue.poll();
            if (leftVal !=null) {
                BinaryTreeNode left = new BinaryTreeNode(leftVal);
                current.left = left;
                treeNodeQueue.offer(left);
            }
            if (rightVal !=null){
                BinaryTreeNode right = new BinaryTreeNode(rightVal);
                current.right = right;
                treeNodeQueue.offer(right);
            }
        }

        return rootNode;
    }

    private void levelOrderBinaryTreeHelper(Integer[] input, int currentIndex, BinaryTreeNode treeNode) {
        if (currentIndex >= input.length || treeNode == null || input[currentIndex] == null) {
            return;
        }

        if (currentIndex > 0) {
            if (currentIndex % 2 == 1) {
                treeNode.left = new BinaryTreeNode(input[currentIndex]);
                treeNode = treeNode.left;
            } else {
                treeNode.right = new BinaryTreeNode(input[currentIndex]);
                treeNode = treeNode.right;
            }
        }

        levelOrderBinaryTreeHelper(input, 2 * currentIndex + 1, treeNode);
        levelOrderBinaryTreeHelper(input, 2 * currentIndex + 2, treeNode);
    }

    public BinaryTreeNode search(BinaryTreeNode binaryTreeNode, int k) {
        if (binaryTreeNode == null) {
            return null;
        }

        BinaryTreeNode current = binaryTreeNode;

        while (current != null) {
            if (current.value == k) {
                return current;
            } else if (k < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return null;
    }

    public BinaryTreeNode insert(BinaryTreeNode binaryTreeNodeRoot, BinaryTreeNode newElement) {
        if (newElement == null) {
            return null;
        }

        // Check the new element value and place it in the tree
        BinaryTreeNode current = binaryTreeNodeRoot;

        BinaryTreeNode previous = null;
        while (current != null) {
            if (current.value == newElement.value) {
                // do nothing
            } else if (newElement.value < current.value) {
                previous = current;
                current = current.left;
            } else {
                previous = current;
                current = current.right;
            }
        }

        if (previous != null) {
            if (newElement.value < previous.value) {
                previous.left = newElement;
            } else {
                previous.right = newElement;
            }
        } else {
            return newElement;
        }

        return binaryTreeNodeRoot;
    }

    public BinaryTreeNode findMinElement(BinaryTreeNode binaryTreeNodeRoot) {
        if (binaryTreeNodeRoot == null) {
            return null;
        }

        BinaryTreeNode current = binaryTreeNodeRoot;

        while (current.left != null) {
            current = current.left;
        }
        /*
        // This result in a never ending loop.
        while (current != null) {
            if (current.left != null) {
                current = current.left;
            }
        }*/

        return current;
    }

    public BinaryTreeNode findMaxElement(BinaryTreeNode binaryTreeNodeRoot) {
        if (binaryTreeNodeRoot == null) {
            return null;
        }

        BinaryTreeNode current = binaryTreeNodeRoot;

        while (current.right != null) {
            current = current.right;
        }

        return current;
    }

    public BinaryTreeNode findSuccessor(BinaryTreeNode binaryTreeNodeRoot, int key) {
        if (binaryTreeNodeRoot == null) {
            return null;
        }

        BinaryTreeNode current = binaryTreeNodeRoot;
        // search the key to find the current node
        boolean nodeFound = false;
        BinaryTreeNode ancestor = null;
        while (current != null && !nodeFound) {
            if (current.value == key) {
                nodeFound = true;
            } else if (key < current.value) {
                ancestor = current;
                current = current.left;
            } else {
                current = current.right;
            }
        }

        // If the current element has a right subtree, the successor can be found in the left subtree under it
        if (current != null && current.right != null) {
            current = current.right;
            while (current.left != null) {
                current = current.left;
            }

            return current;
        }

        // look for the ancestor of the parent, since we don't have access to navigate to the parent - need to start driving down from the root.
        return ancestor;
    }
}
