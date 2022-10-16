package medium40.task_scheduler;

import java.util.*;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : tasks) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(charCountMap.size(),
                                                            Collections.reverseOrder());
        queue.addAll(charCountMap.values());

        int result = 0;
        while (!queue.isEmpty()) {
            int time = 0;
            List<Integer> tempList = new ArrayList<>();
            for (int i=0; i <=n; i++) {
                if (!queue.isEmpty()) {
                    int currentCnt = queue.poll();
                    if (currentCnt - 1 > 0) {
                        tempList.add(currentCnt - 1);
                    }
                    time++;
                }
            }

            for (int t : tempList) {
                queue.add(t);
            }
            result += queue.isEmpty() ? time : n+1;
        }

        return result;
    }
}
