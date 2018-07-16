import java.util.Scanner;

public class PlayView {

    static private Scanner kbin = new Scanner(System.in);
    static public boolean getChoice()
    {
        System.out.println("请输入选择,y为投掷,n为不投掷");
        return ((char)kbin.nextByte())=='y';
    }
    static public void isNotEnrolledOut()
    {
        System.out.println("未入局");
    }
    static void isEnrolledOut()
    {
        System.out.println("入局");
    }
    static public void playerTurnEndOut(int turnScore)
    {
        System.out.println("本回合得分为"+turnScore+",玩家回合结束");
    }
    static public void scoreUntilNowOut(String name,int turnScore)
    {
        System.out.println("玩家当前回合总得分为"+turnScore);
    }
    static public void noDicesLeftOut()
    {
        System.out.println("没有剩余骰子,玩家回合结束");
    }
    static public void playerTotalOut(String name,int totalScore)
    {
        System.out.println(name+"玩家本局总得分为"+totalScore);
    }
    static public void playerGiveupOut(String name)
    {
        System.out.println(name+"玩家放弃投掷，玩家回合结束");
    }
    static public void rollScoreOut(int rollScore)
    {
        System.out.println("本把得分为"+rollScore);
    }
    static public void rollPointOut(String name,int[] point)
    {
        System.out.print(name+"玩家投掷出的骰子点数为");
        for(int i=0;i<6;i++)
        {
            System.out.print(point+" ");
        }
        System.out.println(" ");
    }
    static public void winnerOut(String name)
    {
        System.out.println(name+"达到3000分成为赢家，本局游戏结束");
    }
    static public void shuffledPlayerOut(String[] name)
    {
        for(int i=0;i<6;i++)
        {
            System.out.print(name[i]+" ");
        }
        System.out.println(" ");
    }
}
