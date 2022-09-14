package application.levelordertraversal.mergesortedarrays;

public class MergedSortedArrays {
    /*
    Given two sorted arrays of size n and 2n. Merge smaller array into the
    larger one that has 'n' zeros at the end.

    arr1=[1,3,5]
    arr2=[2,4,6,0,0,0]
     */
    public int[] merge(int[] arr1, int[] arr2) {
        int i = arr1.length - 1;
        int j = i;
        int k = arr2.length- 1;

        while (i>=0 && j>=0) {
            if (arr1[i] > arr2[j]) {
                arr2[k] = arr1[i];
                k--;
                i--;
            } else {
                arr2[k] = arr2[j];
                j--;
                k--;
            }
        }

        while (i >= 0) {
            arr2[k] = arr1[i];
            k--;
            i--;
        }

        return arr2;
    }

    public int[] mergePreElements(int[] arr1, int[] arr2) {
        int i = 0;
        int j = arr1.length;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr2[k] = arr1[i];
                k++;
                i++;
            } else {
                arr2[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < arr1.length) {
            arr2[k] = arr1[i];
            k++;
            i++;
        }

        return arr2;
    }
}
