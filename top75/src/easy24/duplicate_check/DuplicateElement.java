package easy24.duplicate_check;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    public boolean hasDuplicates(int[] input) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i < input.length; i++) {
            if (!set.add(input[i])) {
                return true;
            }
        }
        return false;
    }
}
