package application.dutch_flag;

public class DutchFlag {
    char[] dutchFlagSort(char[] balls) {
        int red = 0;
        int blue = balls.length - 1;
        int p=0;

        while (p <= blue) {
            char current = balls[p];
            if (current == 'R') {
                swap(balls, red, p);
                red++;
                p++;
            } else if (current == 'B') {
                swap(balls, blue, p);
                blue--;
            } else {
                p++;
            }
        }

        return balls;
    }

    private void swap(char[] input, int i, int k) {
        char temp = input[i];
        input[i] = input[k];
        input[k] = temp;
    }
}
