package application.meetingtime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
public class MeetingTime {

    public boolean hasMeetingConflict(ArrayList<ArrayList<Integer>> meetingIntervals) {
        PriorityQueue<ArrayList<Integer>> meetingBoard = new PriorityQueue<>(new MeetingIntervalComparator());
        meetingBoard.addAll(meetingIntervals);

        ArrayList<Integer> previousMeeting = meetingBoard.poll();
        while (!meetingBoard.isEmpty()) {
            ArrayList<Integer> currentMeeting = meetingBoard.poll();

            // Check if current meeting start time is before previous meeting end time
            if (currentMeeting.get(0) < previousMeeting.get(1)) {
                return true;
            }

            previousMeeting = currentMeeting;
        }

        return false;
    }

    class MeetingIntervalComparator implements Comparator<ArrayList<Integer>> {
        public int compare(ArrayList<Integer> interval1, ArrayList<Integer> interval2) {
            // compare only the start times
            return interval1.get(0) - interval2.get(0);
        }
    }
}
