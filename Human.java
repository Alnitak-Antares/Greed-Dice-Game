package greed_game;
public class Human extends Player {
    Human(String name)
    {
        super(name);
    }

    @Override
    public boolean makeChoice(Dices dices) {
        boolean choice = PlayView.getChoice(this.getName());
        if(choice == true)
        {
            dices.roll();
            return true;
        }
        else
            return false;
    }
}
