public class GameManager {
   public static void main(String[] args)
   {

   }
   private Player [] players;
   private int playerNum;
   private ConfigureView configureview=new ConfigureView();

   public void initPlayers()
   {
       for(int i=0;i<playerNum;i++)
       {
           players = new Player[playerNum];
       }
   }

}
