package easy24.duplicate_check;

import org.junit.Assert;
import org.junit.Test;

public class DuplicateElementTest {

    @Test
    public void simple_test() {
        DuplicateElement duplicateElement = new DuplicateElement();
        boolean result = duplicateElement.hasDuplicates(new int[]{1,2,3,-1,1});

        Assert.assertTrue(result);
    }
}
