package medium42.kth_smallest_bst;

import binarysearchtrees.algorithm.BinaryTreeNode;

public class KthSmallestBST {
    public int findKthSmallest(BinaryTreeNode root, int k) {
        int[] index = new int[2];
        dfs_inorder(root, index, k);

        return index[1];
    }

    private void dfs_inorder(BinaryTreeNode root, int[] index, int k) {
        if (root == null) {
            return;
        }

        dfs_inorder(root.left, index, k);
        if (++index[0] == k) {
            index[1] = root.value;
            return;
        }
        dfs_inorder(root.right, index, k);
    }


}
