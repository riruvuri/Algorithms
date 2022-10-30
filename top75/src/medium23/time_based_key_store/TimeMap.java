package medium23.time_based_key_store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeMap {
    private Map<String, List<TimeValue>> map;
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, long timestamp) {
        List<TimeValue> timeValues = map.getOrDefault(key, new ArrayList<>());
        timeValues.add(new TimeValue(timestamp, value));
        map.put(key, timeValues);
    }

    public String get(String key, long timestamp) {
        List<TimeValue> timeValues = map.get(key);
        String response = "";
        if (timeValues != null && !timeValues.isEmpty()) {
            int l = 0;
            int r = timeValues.size() - 1;
            int middle = l + (r-l)/2;

            while (l <= r) {
                if (timeValues.get(middle).timestamp == timestamp) {
                    return timeValues.get(middle).value;
                } else if (timeValues.get(middle).timestamp < timestamp) {
                    response = timeValues.get(middle).value;
                    l = middle + 1;
                } else {
                    r = middle - 1;
                }
            }
        }

        return response;
    }
}

class TimeValue {
    long timestamp;
    String value;

    TimeValue(long timestamp, String value) {
        this.timestamp = timestamp;
        this.value = value;
    }
}
