package DEC05.model;

import DEC05.ScoreCard;
import DEC05.Utils;

public class Team {
    private long teamId;
    private String teamName;
    public Player[] players = new Player[11];
    public ScoreCard teamScore=new ScoreCard();
    //Scanner input = new Scanner(System.in);

    public Team(int id,String team) {
       teamId=id;
     teamName=team;
        for (int player = 0; player < 11; player++) {
            players[player] = new Player();
            String s = "t" + teamId + "p" + (player + 1);
            players[player].setName(s);
            players[player].setPlayerRole((int)(Math.random()*2));
        }

    }


    public void playersList() {
        Utils.printMessage("\n"+teamName+" Team Players List:\n");
        for (int player = 0; player < 11; player++) {
            System.out.println(players[player].getName()+" ("+players[player].getPlayerRole()+")");
        }
        System.out.println();
    }

    public String getTeamName() {
        return teamName;
    }
}
