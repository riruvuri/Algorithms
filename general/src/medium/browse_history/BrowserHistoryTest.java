package medium.browse_history;

import org.junit.Assert;
import org.junit.Test;

public class BrowserHistoryTest {
    @Test
    public void simple_test() {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");       // You are in "leetcode.com". Visit "google.com"
        browserHistory.visit("facebook.com");     // You are in "google.com". Visit "facebook.com"
        browserHistory.visit("youtube.com");      // You are in "facebook.com". Visit "youtube.com"

        // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
        Assert.assertEquals("facebook.com", browserHistory.back(1));

        // You are in "facebook.com", move back to "google.com" return "google.com"
        Assert.assertEquals("google.com", browserHistory.back(1));

        // You are in "google.com", move forward to "facebook.com" return "facebook.com"
        Assert.assertEquals("facebook.com", browserHistory.forward(1));

        // You are in "facebook.com". Visit "linkedin.com"
        browserHistory.visit("linkedin.com");

        browserHistory.forward(2);                // You are in "linkedin.com", you cannot move forward any steps.

        // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
        Assert.assertEquals("google.com", browserHistory.back(2));

        // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"
        Assert.assertEquals("leetcode.com", browserHistory.back(7));
    }
}
