package DEC05.model;

public class Player {
    String name;
    String playerRole;

    public void setName(String playerName) {

        name = playerName;
    }

    public String getName() {
        return name;
    }
    public void setPlayerRole(int role){
        switch (role){
            case 0: playerRole="Batsman";
                break;
            case 1: playerRole="Bowler";
        }
    }
    public String getPlayerRole(){
        return playerRole;
    }
}


    //long id;


    //todo:stats
























