package application.depthfirstsearch.maxwidth;

import binarysearchtrees.algorithm.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeWidth {
    static Integer find_maximum_width(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));

        int maxWidth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int start = queue.peek().index;
            int end = 0;

            while(size-- > 0) {
                Pair pair = queue.poll();
                BinaryTreeNode current = pair.node;
                end = pair.index;

                if (current.left != null) {
                    queue.add(new Pair(current.left, 2* pair.index));
                }

                if (current.right != null) {
                    queue.add(new Pair(current.right, 2* pair.index+1));
                }
            }
            maxWidth = Math.max(maxWidth, end-start+1);
        }

        return maxWidth;
    }

    static class Pair {
        BinaryTreeNode node;
        int index;

        Pair (BinaryTreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }
}
