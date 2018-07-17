public class AI extends Player {
    AI(String name)
    {
        super(name);
    }

    @Override
    public boolean makeChoice(DiceBox diceBox)
    {
    	try   
    	{   
    		Thread.sleep(1000);
    	}   
    	catch(Exception e){}  
        diceBox.roll();
        return true;
    }
}
