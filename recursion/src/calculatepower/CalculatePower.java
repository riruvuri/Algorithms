package calculatepower;

public class CalculatePower {

    public Integer calculate_power(Long a, Long b) {
        return (int)helper(a, b);
    }

    private long helper(Long a, Long b) {
        long mod = 1000000007;

        if (a == 0 || a == 1) {
            return a;
        }
        if (b == 0) {
            return 1;
        }

        long temp = helper(a, b/2) % mod;
        long sqr = (temp * temp)%mod;
        if (b % 2 == 0) {
            return sqr % mod;
        } else {
            return (sqr * (a%mod)) % mod;
        }
    }
}
