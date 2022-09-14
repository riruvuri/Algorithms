package application.mergebst;

import binarysearchtrees.algorithm.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MergeBSTs {

    public BinaryTreeNode mergeBSTs(BinaryTreeNode root1, BinaryTreeNode root2) {
        List<Integer> arrList1 = new ArrayList<>();
        bstToArrayHelper(root1, arrList1);

        List<Integer> arrList2 = new ArrayList<>();
        bstToArrayHelper(root1, arrList2);

        List<Integer> aux = mergeToAux(arrList1, arrList2);

        return prepareBinaryTree(aux, 0, aux.size()-1);
    }

    private List<Integer> mergeToAux(List<Integer> arrList1, List<Integer> arrList2) {
        List<Integer> aux = new ArrayList<>();

        int leftStart = 0;
        int rightStart = 0;

        while (leftStart < arrList1.size() && rightStart < arrList2.size()) {
            if (arrList1.get(leftStart) <= arrList2.get(rightStart)) {
                aux.add(arrList1.get(leftStart));
                leftStart++;
            } else {
                aux.add(arrList2.get(rightStart));
                rightStart++;
            }
        }

        while (leftStart < arrList1.size()) {
            aux.add(arrList1.get(leftStart));
            leftStart++;
        }

        while (rightStart < arrList2.size()) {
            aux.add(arrList2.get(rightStart));
            rightStart++;
        }

        return aux;
    }

    private void bstToArrayHelper(BinaryTreeNode root1, List<Integer> arrList1) {

        /*
        if (root1.left == null && root1.right == null) {
            arrList1.add(root1.value);
            return;
        }*/

        if (root1.left != null) {
            bstToArrayHelper(root1.left, arrList1);
        }

        arrList1.add(root1.value);

        if (root1.right != null) {
            bstToArrayHelper(root1.right, arrList1);
        }
    }

    private BinaryTreeNode prepareBinaryTree(List<Integer> inputList, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end-start)/2;
        BinaryTreeNode root = new BinaryTreeNode(inputList.get(mid));
        root.left = prepareBinaryTree(inputList, start, mid - 1);
        root.right = prepareBinaryTree(inputList, mid+1, end);

        return root;
    }
}