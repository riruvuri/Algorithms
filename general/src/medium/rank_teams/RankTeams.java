package medium.rank_teams;

import java.util.Arrays;

/**
 * LC: 1366. Rank Teams by Votes
 * 1. Each row denote a candidate and the column denotes the position.
 * 2. To identify the actual character, an extra column is added to identify the candidate of the row.
 * 3. Travers through the input list and increment the counter of the candidates at the
 * appropriate position.
 * 4. Sort the array to position the rows based on the occurrence.
 * 5. Build the string based on the sorted position.
 *
 *  https://leetcode.com/problems/rank-teams-by-votes/solutions/619556/java-solution-with-explanation-4ms/
 *  https://leetcode.com/problems/rank-teams-by-votes/solutions/1184766/java-4ms-beats-98-of-submissions-using-2d-array-well-commented/
 * Time complexity: O(n)
 */
public class RankTeams {

    public String rankTeams(String[] votes){
        if (votes.length == 1) {
            return votes[0];
        }
        int[][] mapRanks = new int[26][votes[0].length() + 1];

        for (int i=0; i < mapRanks.length; i++) {
            mapRanks[i][votes[0].length()] = i;
        }

        for (String vote : votes) {
            for (int j=0; j < vote.length(); j++) {
                mapRanks[vote.charAt(j) - 'A'][j]++;
            }
        }

        Arrays.sort(mapRanks, (a, b) -> {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) return b[i]-a[i];
                //if (a[i] < b[i]) return 1;
                //if (a[i] > b[i]) return -1;
            }

            return a[0] - b[0];
        });

        StringBuilder sb = new StringBuilder();
        for (int i=0; i < votes[0].length(); i++) {
            sb.append((char)('A'+mapRanks[i][votes[0].length()]));
        }

        return sb.toString();
    }
}
