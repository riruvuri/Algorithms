package voting;

import org.junit.Assert;
import org.junit.Test;

public class BoyerMooreMajorityVotingAlgoTest {

    @Test
    public void test_vote_simple() {
        int[] polledVotes = {1,1,2,2,2,2,2,3,3};
        int winner = BoyerMooreMajorityVotingAlgo.findMajority(polledVotes);

        Assert.assertEquals(winner, 2);
    }
}
