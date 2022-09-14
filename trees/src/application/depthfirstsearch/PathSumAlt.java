package application.depthfirstsearch;

import binarysearchtrees.algorithm.BinaryTreeNode;

import java.util.Stack;

public class PathSumAlt {

    public boolean hasPathSum(BinaryTreeNode binaryTreeNode, int targetSum) {
        Stack<BinaryTreeNode> nodeStack=new Stack();
        Stack<Integer> sumStack=new Stack();
        if(binaryTreeNode==null){
            return false;
        }

        nodeStack.add(binaryTreeNode);
        sumStack.add(targetSum-binaryTreeNode.value);

        while(!nodeStack.isEmpty()){
            BinaryTreeNode currentNode=nodeStack.pop();
            int currentSum=sumStack.pop();

            if(currentNode.left==null && currentNode.right==null && currentSum==0){
                return true;
            }

            if(currentNode.left!=null){
                nodeStack.add(currentNode.left);
                sumStack.add(currentSum-currentNode.left.value);
            }
            if(currentNode.right!=null){
                nodeStack.add(currentNode.right);
                sumStack.add(currentSum-currentNode.right.value);
            }
        }
        return false;
    }
}
