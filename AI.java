package greed_game;
public class AI extends Player {
    AI(String name)
    {
        super(name);
    }

    @Override
    public boolean makeChoice(Dices dices)
    {
    	try   
    	{   
    		Thread.sleep(1000);
    	}   
    	catch(Exception e){}  
        dices.roll();
        return true;
    }
}
