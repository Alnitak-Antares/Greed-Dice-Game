public class PlayerManager {
    public void start(Player[] players,int playerNum,Dices dices,PlayView playview) {
        sortPlayers(players);
        boolean gameOver = false;
        int playerIdx=-1;
        do {
            playerIdx = (playerIdx+1)%playerNum;
            setDices(dices);
            while(true)
            {
                boolean choice = players[playerIdx].makeChoice(dices);
                Player curPlayer = players[playerIdx];
                if(choice)
                {
                    playview.rollPointOut(curPlayer.getName(),dices.getPoint());
                    int rollScore = countAndRemove(dices);
                    playview.rollScoreOut(rollScore);
                    if(!curPlayer.isEnrolled())
                    {
                        if(rollScore < 300) {
                            //”未入局“
                            break;
                        }
                        else
                            //”入局“
                            curPlayer.setEnrolled();
                    }
                    if(rollScore == 0)
                    {
                        //“本回合得分为零，玩家回合结束”
                        curPlayer.clearTurnScore();
                        break;
                    }
                    curPlayer.addTurnScore(rollScore);
                    //“玩家本回合得分为turnScore”
                    if(dices.getNumber() == 0)
                    {
                        //“没有剩余骰子，玩家回合结束”
                        curPlayer.addTotalScore();
                        curPlayer.clearTurnScore();
                        //"xxw玩家当前总得分为："
                        break;
                    }
                }
                else
                {
                    //"xx玩家放弃投掷，玩家回合结束"
                    curPlayer.addTotalScore();
                    curPlayer.clearTurnScore();
                    //"xxw玩家当前总得分为："
                    break;
                }
            }
            if(curPlayer.getTotalScore() >= 3000)
            {
                //“宣布胜者，本局游戏结束”
                gameOver = true;
                break;
            }
        }while(!gameOver);
    }
    public int countAndRemove(Dices dices) {
        int now_roll_number=dices.getNumber();
        int[] rollscore=new int[now_roll_number];
        rollscore=dices.getPoint();
        int[] roll=new roll [7];
        for(int score=1;score<=6;score++) roll[score]=0;
        int nowscore=0,decroll=0;
        if (roll[1]==6) {
            roll[1]-=6;
            nowscore+=3000;
            decroll+=6;
        }
        if (roll[1]>=3) {
            roll[1]-=3;
            nowscore+=1000;
            decroll+=3;
        }
        for(int score=2;score<=6;score++) {
            if (roll[score]>=3) {
                roll[score]-=3;
                nowscore+=score*100;
                decroll+=3;
            }
            if (roll[score]>=3) {
                roll[score]-=3;
                nowscore+=score*100;
                decroll+=3;
            }
        }
        while (roll[1]>0) {
            roll[1]--;
            nowscore+=100;
            decroll++;
        }
        while (roll[5]>0) {
            roll[5]--;
            nowscore+=50;
            decroll++;
        }
        dices.removeDices(decroll);
    }


    public void setDices(Dices dices) {


    }
    public void sortPlayers(Player[] players)
    {

    }
}
