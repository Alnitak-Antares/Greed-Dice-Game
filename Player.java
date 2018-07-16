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

    public static void rollDice(Dices dices) {
        dices.roll();
    }

    abstract public boolean makeChoice();
    public void getEnrolled()
    {
        enrolled = true;
    }
    public int getTotalScore()
    {
        return totalScore;
    }
    public int getTurnScore()
    {
        return turnScore;
    }
    public void clearTurnScore()
    {
        turnScore = 0;
    }
    public void endTurn()
    {
        totalScore += turnScore;
        turnScore = 0;
    }
}
