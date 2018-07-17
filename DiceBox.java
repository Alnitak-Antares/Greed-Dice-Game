import java.util.Random;

public class DiceBox {
    private int diceNumber = 6;
    private int dicePoint[] = new int[6];

    public void roll()
    {
        Random rand = new Random();
        for(int i = 0;i < diceNumber;i++)
        {
            dicePoint[i] = rand.nextInt(6)+1;
        }
    }
    public int getNumber()
    {
        return diceNumber;
    }
    public void reset()
    {
        diceNumber=6;
    }
    public int[] getPoint()
    {
        return dicePoint;
    }
    public void removeDices(int removenumber)
    {
        diceNumber -= removenumber;
    }
}
