public class GameManager {
    public static void main(String[] args)
    {
        configureGame();
        startGame();
    }
    private static Player [] players = new Player[10];
    private static int playerNum = 0;

    public static void configureGame()
    {
        boolean isConfigureEnd;
        String playerName;
        int playerType;
        while(true) {

            isConfigureEnd = ConfigureView.getIfEnd();
            if(isConfigureEnd)
            {
                if(playerNum<2)
                    System.out.println("请至少有两名玩家参加游戏");
                else
                    break;
            }
            if(playerNum == 10)
            {
                System.out.println("玩家最多为十人");
                continue;
            }
            playerType = ConfigureView.getPlayerType();
            playerName = ConfigureView.getPlayerName();
            if(playerType == 0)
                players[playerNum++] = new Human(playerName);
            else
                players[playerNum++] = new AI(playerName);

        }
    }
    public static void startGame()
    {
        Dices dices = new Dices();
        PlayerManager playermanager = new PlayerManager();
        playermanager.start(players,playerNum,dices);
    }

}
