package binarysearchtrees.algorithm;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public Integer value;
    public List<TreeNode> children;

    TreeNode(Integer value) {
        this.value = value;
        this.children = new ArrayList(3);
    }
}