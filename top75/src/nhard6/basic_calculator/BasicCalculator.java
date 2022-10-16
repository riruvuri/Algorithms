package nhard6.basic_calculator;

public class BasicCalculator {
    char[] arr;
    int index = 0;

    public int calculate(String s) {
        arr = s.toCharArray();
        return dfs();
    }

    private int dfs() {
        int sum = 0;
        int operator = 1;

        while (index < arr.length) {
            if (arr[index] == ')') {
                break;
            } else if (arr[index] == '(') {
                index++;
                sum += operator * dfs();
            } else if (arr[index] == '-') {
                operator = -1;
            } else if (arr[index] == '+') {
                operator = 1;
            } else if (Character.isDigit(arr[index])) {
                StringBuilder sb = new StringBuilder();

                while (index < arr.length && Character.isDigit(arr[index])) {
                    sb.append(arr[index++]);
                }
                index--;
                sum += Integer.parseInt(sb.toString()) * operator;
            }
            index++;
        }
        return sum;
    }
}
