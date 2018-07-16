abstract public class Player {
    private String name;
    private boolean enrolled = false;
    private int totalScore = 0;
    private int turnScore = 0;
    //private int rollScore = 0;

    Player(String playerName)
    {
        name = playerName;
    }

    abstract public boolean makeChoice();
    
    public String getName()
    {
        return name;
    }
    public boolean isEnrolled()
    {
        return enrolled;
    }
    public void getEnrolled()
    {
        enrolled = true;
    }
    public int setTotalScore()
    {
        return totalScore;
    }
    public void addTotalScore(int score)
    {
        totalScore += score;
    }
    public int getTurnScore()
    {
        return turnScore;
    }
    public void addTurnScore(int score)
    {
        turnScore += score;
    }
    public void clearTurnScore()
    {
        turnScore = 0;
    }
}
