package medium.rotate_image;

import org.junit.Assert;
import org.junit.Test;

public class RotateImageTest {

    @Test
    public void simple_test() {
        int[][] input = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        RotateImage rotateImage = new RotateImage();
        rotateImage.rotate(input);

        Assert.assertArrayEquals(new int[][]{{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}}, input);
    }
}
