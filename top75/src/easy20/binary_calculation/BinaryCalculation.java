package easy20.binary_calculation;

public class BinaryCalculation {
    public String addBinary(String a, String b) {
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        int i = arr1.length - 1, j = arr2.length - 1;
        int carry = 0;
        String result = "";
        while (i >= 0 || j >= 0) {
            int currentResult = (i >= 0 ? arr1[i] - '0' : 0)
                                + (j >= 0 ? arr2[j] - '0' : 0)
                                + carry;
            carry = currentResult / 2;
            result = (currentResult % 2) + result;
            i--;
            j--;
        }

        if (carry > 0) {
            result = carry + result;
        }

        return result;
    }
}
