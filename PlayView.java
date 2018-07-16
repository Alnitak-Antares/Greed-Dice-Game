import java.util.Scanner;

public class PlayView {
    //private Scanner kbin = new Scanner(System.in);
    public void isNotEnrolledOut()
    {
        System.out.println("未入局");
    }
    public void isEnrolledOut()
    {
        System.out.println("入局");
    }
    public void playerTurnEndOut(int turnScore)
    {
        System.out.println("本局得分为"+turnScore+",玩家回合结束");
    }
    public void scoreUntilNowOut(String name,int turnScore)
    {
        System.out.println("玩家当前总得分为"+turnScore);
    }
    public void noDicesLeftOut()
    {
        System.out.println("没有剩余骰子,玩家回合结束");
    }
    public void playerTotalOut(String name,int turnScore)
    {
        System.out.println(name+"玩家当前总得分为"+turnScore);
    }
    public void playerGiveupOut(String name)
    {
        System.out.println(name+"玩家放弃投掷，玩家回合结束");
    }
    public void rollScoreOut(int rollScore)
    {
        System.out.println("本把得分为"+rollScore);
    }
    public void rollPointOut(String name,int[] point)
    {
        System.out.print(name+"玩家投掷出的骰子点数为");
        for(int i=0;i<6;i++)
        {
            System.out.print(point+" ");
        }
        System.out.println(" ");
    }
    public void shuffledPlayerOut(String[] name)
    {
        for(int i=0;i<6;i++)
        {
            System.out.print(name[i]+" ");
        }
        System.out.println(" ");
    }
}
