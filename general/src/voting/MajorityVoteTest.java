package voting;

import org.junit.Assert;
import org.junit.Test;

public class MajorityVoteTest {

    @Test
    public void test_vote_simple() {
        String[] polledVotes = {"john","johnny","jackie","johnny","john", "jackie","jamie",
                                "jamie","john","johnny","jamie",
                                "johnny","john"};
        MajorityVote majorityVote = new MajorityVote();
        String winner = majorityVote.findWinner(polledVotes, 13);

        Assert.assertEquals(winner, "john");
    }
}
