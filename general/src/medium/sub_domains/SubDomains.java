package medium.sub_domains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubDomains {
    public List<String> subdomainVisits(String[] cpDomains) {
        Map<String, Integer> domainMap = new HashMap<>();
        for (String domain : cpDomains) {
            String[] domainCnt = domain.split("\\s+");
            String[] urlInfo = domainCnt[1].split("\\.");
            int count = Integer.parseInt(domainCnt[0]);

            String previous = "";
            for (int i=urlInfo.length-1; i >= 0; i--) {
                String current = urlInfo[i];
                if (previous.length() > 0) {
                    current = current+"."+previous;
                }
                domainMap.put(current, domainMap.getOrDefault(current, 0) + count);

                previous = current;
            }
        }
        List<String> outputList = new ArrayList<>();
        for (Map.Entry<String,Integer> entry : domainMap.entrySet()) {
            outputList.add(entry.getValue() + " " + entry.getKey());
        }

        return outputList;
    }
}
