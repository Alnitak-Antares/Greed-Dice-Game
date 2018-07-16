package greed_game;
public class AI extends Player {
    AI(String name)
    {
        super(name);
    }

    @Override
    public boolean makeChoice(Dices dices)
    {
        dices.roll();
        return true;
    }
}
