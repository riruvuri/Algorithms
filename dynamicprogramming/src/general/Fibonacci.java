package general;

public class Fibonacci {

    static Integer find_fibonacci(Integer n) {
        int[] memo = new int[3];
        memo[0] = 0;
        memo[1] = 1;

        for (int i=2; i <=n; i++) {
            memo[i%3] = memo[(i-1)%3] + memo[(i-2)%3];
        }
        return memo[n%3];
    }

}
