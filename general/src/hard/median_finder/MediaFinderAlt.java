package hard.median_finder;

import java.util.ArrayList;
import java.util.List;

public class MediaFinderAlt {
    List<Integer> list = null;


    public MediaFinderAlt() {
        list = new ArrayList<>();
    }

    public void addNum(int num) {
        int i=0;
        for (; i < list.size() && list.get(i) < num; i++);
        list.add(i, num);
    }

    public double findMedian() {
        int index = list.size()/2;
        if (list.size() % 2 == 0) {
            return (list.get(index) + list.get(index-1)) * 1.0 /2;
        }


        return list.get(index) * 1.0;
    }
}
