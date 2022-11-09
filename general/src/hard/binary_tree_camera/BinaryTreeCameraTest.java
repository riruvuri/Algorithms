package hard.binary_tree_camera;

import binarysearchtrees.algorithm.BSTHelper;
import binarysearchtrees.algorithm.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeCameraTest {
    @Test
    public void simple_test() {
        BinaryTreeNode rootNode = new BSTHelper().createLevelOrderBinaryTree(new Integer[]{0,0,null,0,0});
        BinaryTreeCamera binaryTreeCamera = new BinaryTreeCamera();
        int result = binaryTreeCamera.minCameraCover(rootNode);

        Assert.assertTrue(result == 1);
    }

    @Test
    public void simple_alt() {
        BinaryTreeNode rootNode = new BSTHelper().createLevelOrderBinaryTree(new Integer[]{0,0,null,0,null,0,null,null,0});
        BinaryTreeCamera binaryTreeCamera = new BinaryTreeCamera();
        int result = binaryTreeCamera.minCameraCover(rootNode);

        Assert.assertTrue(result == 2);
    }
}
