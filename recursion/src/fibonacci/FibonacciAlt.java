package fibonacci;

class FibonacciAlt {
    public static void main(String[] args) {
        new FibonacciAlt().getFibonacci(4);
    }

    public int getFibonacci(int n) {
        int[] elements = new int[2];
        elements[0]=1;
        elements[1]=1;

        int result = 1;
        for (int i=2; i < n; i++) {
            result = elements[0] + elements[1];
            elements[0] = elements[1];
            elements[1] = result;
        }

        return result;
    }
}
