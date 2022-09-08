package calculatepower;

class CalculatePowerBasic {
    public long calculatePower(long a, long b) {
        // base case
        if (b == 1) {
            return a;
        }
        if (b == 0) {
            return 1;
        }

        long result = 1;
        // Check if b is even or odd
        long target = calculatePower(a, b/2);
        if (b%2 == 0) {
            result = target * target;
        } else {
            result = a * target * target;
        }

        return result;
    }
}
