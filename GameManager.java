package greed_game;
public class GameManager {
    public static void main(String[] args)
    {
    	ConfigureView.intoGreed();
    	do {
    		configureGame();
    		startGame();
    	}while (ConfigureView.getIfNextGreedGame());
    }
    private static Player [] players = new Player[10];
    private static int playerNum = 0;

    public static void configureGame()
    {
        boolean isConfigureEnd;
        String playerName;
        int playerType;
        ConfigureView.startConfigure();
        playerNum=0;
        while(true) {

            isConfigureEnd = ConfigureView.getIfEnd();
            if(isConfigureEnd)
            {
                if(playerNum<2)
                	ConfigureView.errorInput(1);
                else
                    break;
                continue;
            }
            if(playerNum == 10)
            {
                ConfigureView.errorInput(2);
                continue;
            }
            playerType = ConfigureView.getPlayerType();
            playerName = ConfigureView.getPlayerName();
            if(playerType == 0)
                players[playerNum++] = new Human(playerName);
            else
                players[playerNum++] = new AI(playerName);
        }
        ConfigureView.startGame();
    }
    public static void startGame()
    {
        Dices dices = new Dices();
        PlayerManager playermanager = new PlayerManager();
        playermanager.start(players,playerNum,dices);
    }

}
