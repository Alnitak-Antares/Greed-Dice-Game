public class Human extends Player {
    Human(String name)
    {
        super(name);
    }

    @Override
    public boolean makeChoice(DiceBox diceBox) {
        boolean choice = PlayView.getChoice(this.getName());
        if(choice == true)
        {
            diceBox.roll();
            return true;
        }
        else
            return false;
    }
}
