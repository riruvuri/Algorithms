package graph.coursecompletion;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CourseCompletionTest {


    @Test
    public void test_simple() {
        CourseCompletion courseCompletion = new CourseCompletion();
        boolean result = courseCompletion.canCourseBeCompleted(4,
                                                Arrays.asList(1,1,3),
                                                Arrays.asList(0,2,1));

        Assert.assertEquals(true, result);
    }

    @Test
    public void test_failure() {
        CourseCompletion courseCompletion = new CourseCompletion();
        boolean result = courseCompletion.canCourseBeCompleted(4,
                Arrays.asList(1, 1, 3, 0),
                Arrays.asList(0, 2, 1, 3));

        Assert.assertEquals(false, result);
    }
}
