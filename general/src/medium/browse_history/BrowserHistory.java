package medium.browse_history;

import java.util.ArrayList;
import java.util.List;

/**
 * LC: 1472
 */
public class BrowserHistory {
    private List<String> history;
    private int currentPage = -1;
    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        currentPage = 0;
    }

    public void visit(String url) {
        for (int i= history.size()-1; i > currentPage; i--) {
            history.remove(i);
        }
        history.add(url);
        currentPage = history.size() - 1;
   }

    public String back(int steps) {
        /*
        if (steps >= currentPage){
            steps = 0;
        } else {
            steps = currentPage - steps;
        }*/

        currentPage = Math.max(currentPage-steps, 0);

        return history.get(currentPage);
    }

    public String forward(int steps) {
        /*
        if (currentPage+ steps >= history.size()) {
            return "";
        }
        if (steps >= history.size()){
            currentPage = history.size() - 1;
        } else {
            currentPage += steps;
        }*/

        currentPage = Math.min(currentPage+steps, history.size()-1);

        return history.get(currentPage);
    }
}
