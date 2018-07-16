package greed_game;
import java.util.Random;

public class PlayerManager {
    public void start(Player[] players,int playerNum,Dices dices) {
        sortPlayers(players,playerNum);
        
        boolean gameOver = false;
        int playerIdx=-1;
        /*全部人还没入局*/
        do {
            playerIdx = (playerIdx+1)%playerNum;
            dices.reset();
            Player curPlayer;
            while(true)
            {
                boolean choice = players[playerIdx].makeChoice(dices);
                curPlayer = players[playerIdx];
                if(choice)
                {
                	PlayView.rollPointOut(curPlayer.getName(),dices.getPoint());
                    int rollScore = countAndRemove(dices);
                    PlayView.rollScoreOut(rollScore);
                    if(!curPlayer.isEnrolled())
                    {
                        if(rollScore < 300) {
                            //”未入局“
                        	PlayView.isNotEnrolledOut();
                            break;
                        }
                        else {
                            //”入局“
                        	PlayView.isEnrolledOut();
                            curPlayer.setEnrolled();
                        }
                    }
                    if(rollScore == 0)
                    {
                        //“本回合得分为零，玩家回合结束”
                        curPlayer.clearTurnScore();
                        PlayView.playerTurnEndOut(curPlayer.getTurnScore());
                        break;
                    }
                    curPlayer.addTurnScore(rollScore);
                    //“玩家本回合得分为turnScore”
                    PlayView.scoreUntilNowOut(curPlayer.getName(),curPlayer.getTurnScore());
                    if(dices.getNumber() == 0)
                    {
                        //“没有剩余骰子，玩家回合结束”
                    	PlayView.noDicesLeftOut();
                        //curPlayer.addTotalScore();
                        //curPlayer.clearTurnScore();
                        //"xxw玩家当前总得分为："
                        break;
                    }
                }
                else
                {
                    //"xx玩家放弃投掷，玩家回合结束"
                	PlayView.playerGiveupOut(curPlayer.getName());
                    //curPlayer.addTotalScore();
                    //curPlayer.clearTurnScore();
                    //"xxw玩家当前总得分为："
                    break;
                }
            }
            //"玩家回合结束"
            curPlayer.addTotalScore(curPlayer.getTurnScore());
            curPlayer.clearTurnScore();
            //打印玩家信息

            PlayView.playerTotalOut(curPlayer.getName(),curPlayer.getTotalScore());
            if(curPlayer.getTotalScore() >= 3000)
            {
                //“宣布胜者，本局游戏结束”
                gameOver = true;
                PlayView.winnerOut(curPlayer.getName());
                break;
            }
        }while(!gameOver);
    }
    public int countAndRemove(Dices dices) {
        int now_roll_number=dices.getNumber();
        int[] rollscore=dices.getPoint();
        int[] roll=new int[7];
        for(int score=1;score<=6;score++) roll[score]=0;
        for(int dicesid=0;dicesid<now_roll_number;dicesid++)
        	roll[rollscore[dicesid]]++;
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
        return nowscore;
    }

    
    public void sortPlayers(Player[] players,int playerNum)
    {
    	Random rand = new Random();
    	Player tmpPlayer;
    	for(int i=0;i<playerNum;i++) {
    		Player swapPlayer=players[rand.nextInt(i+1)];
    		tmpPlayer=swapPlayer;
    		swapPlayer=players[i];
    		players[i]=tmpPlayer;
    	}
    }
}
