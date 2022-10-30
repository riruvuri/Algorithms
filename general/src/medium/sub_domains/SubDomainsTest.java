package medium.sub_domains;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SubDomainsTest {
    @Test
    public void simple_test() {
        String[] domains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};

        SubDomains subDomains = new SubDomains();
        List<String> resultList = subDomains.subdomainVisits(domains);
        List<String> expectedList = Arrays.asList("901 mail.com","50 yahoo.com",
                                                    "900 google.mail.com","5 wiki.org",
                                                    "5 org","1 intel.mail.com","951 com");

        Assert.assertTrue(expectedList.size() == resultList.size()
                                && resultList.containsAll(expectedList)
                                && expectedList.containsAll(resultList));
    }
}
