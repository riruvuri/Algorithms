package application.levelordertraversal.meetingtime;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MeetingTimeTest {

    @Test
    public void test_meetingTime() {
        //[[1,2],[2,3],[3,4]]
        ArrayList<ArrayList<Integer>> meetingIntervals = new ArrayList<>();
        meetingIntervals.add(interval(1,2));
        meetingIntervals.add(interval(2,3));
        meetingIntervals.add(interval(3,4));

        MeetingTime meetingTime = new MeetingTime();
        boolean meetingConflict = meetingTime.hasMeetingConflict(meetingIntervals);
        Assert.assertEquals(false, meetingConflict);
    }

    @Test
    public void test_meetingTimeConflict() {
        //[[1,2],[2,3],[3,4]]
        ArrayList<ArrayList<Integer>> meetingIntervals = new ArrayList<>();
        meetingIntervals.add(interval(1,2));
        meetingIntervals.add(interval(2,4));
        meetingIntervals.add(interval(0,23));

        MeetingTime meetingTime = new MeetingTime();
        boolean meetingConflict = meetingTime.hasMeetingConflict(meetingIntervals);
        Assert.assertEquals(true, meetingConflict);
    }

    private ArrayList<Integer> interval(int start, int end) {
        ArrayList<Integer> intervalList = new ArrayList<>();
        intervalList.add(start);
        intervalList.add(end);

        return intervalList;
    }
}
