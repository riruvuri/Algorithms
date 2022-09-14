package arrays;

import java.util.Random;

public class RandomNumberUtil {

    public static int generateRandomNumber(int start, int end) {
        Random random = new Random();
        return random.nextInt((end - start) + 1) + start;
    }
}
