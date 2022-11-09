package medium.daily_temperatures;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] waitDays = new int[temperatures.length];

        Stack<List<Integer>> stack = new Stack<>();
        for (int i=temperatures.length-1; i >=0; i--) {
            while (!stack.isEmpty() && stack.peek().get(0) < temperatures[i]) {
                stack.pop();
            }
            waitDays[i] = !stack.isEmpty() ? stack.peek().get(1) - i : 0;

            stack.push(Arrays.asList(temperatures[i], i));
        }

        return waitDays;
    }
}
