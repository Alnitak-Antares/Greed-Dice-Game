public class GameManager {
    public static void main(String[] args)
    {
        configureGame();
        startGame();
    }
    private static player [] players;
    private static int playerNum=0;

    public static void configureGame()
    {
        ConfigureView configureview = new ConfigureView();
        boolean isConfigureEnd = false;
        String playerName = new String();
        int playerType;
        while(true) {
            isConfigureEnd = configureview.getIfEnd();
            if(isConfigureEnd)
                break;
            playerType = configureview.getPlayerType();
            playerName = configureview.getPlayerName();
            //player[playerNum++] = new Player(playerType,playerName);
        }
    }
    public static void startGame()
    {

        PlayerManager playermanager = new PlayerManager();
        playermanager.start(Player players);
    }

}
