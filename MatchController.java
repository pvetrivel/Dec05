package DEC05;

import DEC05.model.Team;


public class MatchController implements Match {
    Team team1 = new Team(1, "India");
    Team team2 = new Team(2, "Pakistan");


    public void startMatch() {
        team1.playersList();
        team2.playersList();
        team1.teamScore.setRuns(playInnings(team1, team2, 0));
        //int target=team1.teamScore.getRuns();
        team2.teamScore.setRuns(playInnings(team2, team1, team1.teamScore.getRuns()));
        endMatch();
        matchSummary();
    }

    void matchSummary() {
        Utils.printMessage(team1.getTeamName() + " scored " + team1.teamScore.getRuns() + " for " + (team2.teamScore.getBalls())/6 + " overs and lost " + team2.teamScore.getWickets() + " wickets");
        Utils.printMessage(team2.getTeamName() + " scored " + team2.teamScore.getRuns() + " for " + (team1.teamScore.getBalls())/6 + " overs and lost " + team1.teamScore.getWickets() + " wickets");

    }

    public int playInnings(Team bat, Team bowl, int target) {
        int innScore = 0;
        int batsman = 0;
        while (batsman < 10) {
            for (int balls = 0; balls < 6; balls++) {
                if ((batsman < 10) && (target == 0 || target >= innScore)) {
                    int runs = Utils.doRandom(8, bat);
                    if (runs < 7) {
                        innScore += runs;
                    } else {
                        bowl.teamScore.setWickets();
                        batsman++;
                    }

                    bowl.teamScore.setBalls();
                }else {
                    return innScore;
                }
            }
        }
        return innScore;
    }

    public void endMatch() {
        if (team1.teamScore.getRuns() < team2.teamScore.getRuns()) {
            Utils.printMessage(team2.getTeamName() + " won the match");
        } else if (team2.teamScore.getRuns() < team1.teamScore.getRuns()) {
            Utils.printMessage(team1.getTeamName() + " won the match");
        } else {
            Utils.printMessage("Match Tie");
        }
    }

}