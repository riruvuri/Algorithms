package selectionsort.stringsort;

/**
 * Given a string, sort the characters and print the sorted string
 */
public class StringSort {
    public static void main(String[] args) {
        String inputStr = "sortexample";
        String sortedStr = sort(inputStr);

        System.out.println(sortedStr);
    }

    public static String sort(String input) {
        char[] inputArray = input.toCharArray();

        for (int i=0; i < inputArray.length - 1; i++) {
            int minIndex = i;
            for (int j=i+1; j < inputArray.length; j++) {
                if (inputArray[minIndex] > inputArray[j]) {
                    minIndex = j;
                }
            }
            // swap minIndex with i;
            if (i !=  minIndex) {
                swap(inputArray, i, minIndex);
            }
        }
        return new String(inputArray);
    }

    public static void swap(char[] inputArray, int i, int j) {
        char temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }
}


