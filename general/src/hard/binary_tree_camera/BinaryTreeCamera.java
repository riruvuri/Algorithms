package hard.binary_tree_camera;

import binarysearchtrees.algorithm.BinaryTreeNode;

/**
 * LC: 968
 *
 * https://leetcode.com/problems/binary-tree-cameras/solutions/2160360/visual-explanation-java-greedy/
 *
 * Time complexity: O(n)
 * Space complexity: O(h) where h is the height of the tree.
 */
public class BinaryTreeCamera {
    int minCamera = 0;
    public int minCameraCover(BinaryTreeNode root) {

        return dfs(root) == -1 ? minCamera + 1 : minCamera;
    }

    // -1: NOT MONITORED
    //  0: MONITORED
    //  1: HAS CAMERA
    private int dfs(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftMonitor = dfs(root.left);
        int rightMonitor = dfs(root.right);

        // This is to cover leaf nodes
        if (leftMonitor == -1 || rightMonitor == -1) {
            minCamera++;
            return 1;
        }

        if (leftMonitor == 1 || rightMonitor == 1) {
            // If the child has the camera, parent doesn't need one
            return 0;
        }

        return -1;
    }
}
