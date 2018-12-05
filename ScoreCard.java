package DEC05;

public class ScoreCard {
    private int runs=0;
    private int balls=0;
    private int wickets=0;

    public void setRuns(int score){
        this.runs=score;
    }
    public int getRuns(){
        return runs;
    }
    public void setBalls(){
        this.balls++;
    }
    public int getBalls(){
        return balls;
    }

    public void setWickets() {
        this.wickets++;
    }
    public int getWickets(){
        return wickets;
    }
}
