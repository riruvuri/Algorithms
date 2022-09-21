package voting;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityVote {
    public String findWinner(String[] polledVoteList, int n) {
        Map<String, Integer> voteCounterMap = new HashMap<>();
        for (int i=0; i < polledVoteList.length; i++) {
            int polledVoteCount = voteCounterMap.getOrDefault(polledVoteList[i], 0);
            voteCounterMap.put(polledVoteList[i], ++polledVoteCount);
        }

        int minPolledVotes = 0;
        String winner = null;
        for (String candidate : voteCounterMap.keySet()) {
            int polledVotes = voteCounterMap.get(candidate);

            if (polledVotes > minPolledVotes) {
                minPolledVotes = polledVotes;
                winner = candidate;
            } else if (polledVotes == minPolledVotes) {
                if (winner.compareTo(candidate) > 0) {
                    winner = candidate;
                }
            }
        }

        return winner;
    }
}
