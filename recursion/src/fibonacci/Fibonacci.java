package fibonacci;

public class Fibonacci {
    public int getFibonacci(int n) {
        if (n==0 ||n==1) {
            return n;
        }

        int prev = 1;
        int prevPrev = 0;
        int current = 0;
        for (int i=2; i <= n; i++) {
            current = prev + prevPrev;
            prevPrev = prev;
            prev=current;
        }

        return current;
    }
}
