public class Human extends Player {
    Human(String name)
    {
        super(name);
    }

    @Override
    public boolean makeChoice(Dices dices) {
        boolean choice = PlayView.choiceGet();
        if(choice == true)
        {
            dices.roll();
            return true;
        }
        else
            return false;
    }
}
