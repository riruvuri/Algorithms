package nhard7.job_scheduling;

import java.util.*;

/*
https://www.youtube.com/watch?v=cr6Ip0J9izc
 */
public class JobScheduling {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        List<Job> jobList = new ArrayList<>();

        for(int i=0;i<n;i++){
            jobList.add(new Job(startTime[i], endTime[i], profit[i]));
        }

        Collections.sort(jobList, Comparator.comparing(Job::getEnd));

        int[] profits = new int[n];
        profits[0] = jobList.get(0).profit;

        for (int i=1; i < jobList.size(); i++) {
            for (int j=i-1; j >=0; j--) {
                if (jobList.get(j).end <= jobList.get(i).start) {
                    profits[i] = Math.max(profits[i], jobList.get(i).profit + profits[j]);
                }
            }
        }

        int maxVal = Integer.MIN_VALUE;
        for (int val : profits) {
            if (maxVal < val) {
                maxVal = val;
            }
        }

        return maxVal;
    }
}

class Job{
    int start;
    int end;
    int profit;
    Job(int start,int end,int profit){
        this.start= start;
        this.end = end;
        this.profit= profit;
    }

    public int getEnd() {
        return end;
    }
}