package easy.cousins_binary_tree;

import binarysearchtrees.algorithm.BinaryTreeNode;

/**
 *
 * LC: 993
 *
 * https://leetcode.com/problems/cousins-in-binary-tree/solutions/607442/cousins-in-binary-tree/
 *
 * Time complexity: O(n)
 * Space complexity: O(n)
 */

public class BinaryTreeCousins {
    //private Map<Integer, Integer> levelParentMap = new HashMap<>();
    private int recordedLevel = -1;
    public boolean isCousins(BinaryTreeNode root, int x, int y) {
        boolean isCousins = dfs(root, x, y, 0);

        return isCousins;
    }

    private boolean dfs(BinaryTreeNode root, int x, int y, int level) {
        if (root == null) {
            return false;
        }

        if (recordedLevel != -1 && level > recordedLevel) {
            return false;
        }

        if (root.value == x || root.value == y) {
            if (recordedLevel == -1) {
                recordedLevel = level;
            }
            /*
            if (levelParentMap.size() > 0) {
                if (levelParentMap.get(level) == null) {
                    return false;
                } else {
                    return levelParentMap.get(level).intValue() != parent;
                }
            } else {
                levelParentMap.put(level, parent);
            }*/
            return this.recordedLevel == level;
        }

        boolean hasLeftChild = false;
        boolean hasRightChild = false;
        if (root.left != null) {
            hasLeftChild = dfs(root.left, x, y , level + 1);
        }

        if (root.right != null) {
            hasRightChild = dfs(root.right, x, y , level + 1);
        }

        if (hasLeftChild && hasRightChild) {
            return recordedLevel != level + 1;
        }

        return hasLeftChild || hasRightChild;
    }
}
