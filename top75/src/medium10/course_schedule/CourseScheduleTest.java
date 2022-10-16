package medium10.course_schedule;

import org.junit.Assert;
import org.junit.Test;

public class CourseScheduleTest {
    @Test
    public void test_simple() {
        CourseSchedule courseSchedule = new CourseSchedule();
        boolean result = courseSchedule.canFinish(2, new int[][]{{0,1},{1,0}});

        Assert.assertEquals(true, result);
    }

    @Test
    public void test_failure() {
        CourseSchedule courseSchedule = new CourseSchedule();
        boolean result = courseSchedule.canFinish(4, new int[][]{{1,0},{1,2},{3,1},{0,3}});

        Assert.assertEquals(false, result);
    }
}
