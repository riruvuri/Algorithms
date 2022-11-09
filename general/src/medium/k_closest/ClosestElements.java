package medium.k_closest;

import java.util.ArrayList;
import java.util.List;

public class ClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> outputList = new ArrayList<>();

        /*
        int l = 0;
        int r = arr.length - 1;
        int matchElement = -1;
        while (l < r) {
            int mid = (l+r)/2;
            if (x == arr[mid]) {
                matchElement = mid;
            } else if (x > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        if (matchElement != -1) {
            x = matchElement;
        } else {
            x= l;
        }*/

        // Binary search to find the closest element
        int l = 0;
        int r = arr.length;
        int mid = 0;
        while (l < r) {
            mid = (l + r) / 2;
            if (arr[mid] >= x) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        l= Math.max(0, x-1);
        r= Math.min(arr.length-1, x+1);

        outputList.add(arr[x]);
        int i=0;
        while (outputList.size() < k) {
            if (l >= 0 && Math.abs(arr[x] - arr[l]) <= Math.abs(arr[x] - arr[r])) {
                outputList.add(0, arr[l]);
                l = l - 1;
            } else if (r <= arr.length-1){
                outputList.add(arr[r]);
                r = r + 1;
            }
        }

        return outputList;
    }
}
