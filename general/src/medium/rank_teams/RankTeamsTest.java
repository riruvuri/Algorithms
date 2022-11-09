package medium.rank_teams;

import org.junit.Assert;
import org.junit.Test;

public class RankTeamsTest {
    @Test
    public void simple_test() {
        RankTeams rankTeams = new RankTeams();
        String teamRank = rankTeams.rankTeams(new String[]{"ABC","ACB","ABC","ACB","ACB"});

        Assert.assertTrue(teamRank.equals("ACB"));
    }

    @Test
    public void simple_test_alt1() {
        RankTeams rankTeams = new RankTeams();
        String teamRank = rankTeams.rankTeams(new String[]{"WXYZ","XYZW"});

        Assert.assertTrue(teamRank.equals("XWYZ"));
    }

    @Test
    public void simple_test_alt2() {
        RankTeams rankTeams = new RankTeams();
        String teamRank = rankTeams.rankTeams(new String[]{"ZMNAGUEDSJYLBOPHRQICWFXTVK"});

        Assert.assertTrue(teamRank.equals("ZMNAGUEDSJYLBOPHRQICWFXTVK"));
    }
}
