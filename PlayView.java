import java.util.Scanner;

public class PlayView {

    static private Scanner kbin = new Scanner(System.in);
    static public boolean getChoice(String name)
    {
    	boolean flag=false;
    	String c;
    	do {
    		c=kbin.next();
    		if (c.contains("y") || c.contains("Y") || c.contains("n") || c.contains("N")) flag=true;
    		if (flag==false) System.out.println("Input Error,请再次输入");
    	}while (flag==false);
        return c.contains("y");
    }
    static public void nowaskDices(String name) {
    	System.out.println("玩家"+name+"请做出决策,y为投掷,n为不投掷");
    }
    static public void isNotEnrolledOut(String name)
    {
        System.out.println("玩家"+"未满足入局条件");
    }
    static void isEnrolledOut(String name)
    {
        System.out.println("玩家"+name+"入局");
    }
    static public void playerTurnEndOut(int turnScore)
    {
        System.out.println("本回合得分为"+turnScore+",玩家回合结束");
    }
    static public void scoreUntilNowOut(String name,int turnScore)
    {
    	
        System.out.println("玩家当前回合累计得分为"+turnScore);
        System.out.println("");
    }
    static public void noDicesLeftOut()
    {
        System.out.println("没有剩余骰子,玩家回合结束");
        System.out.println(" ");
    }
    static public void playerTotalOut(String name,int totalScore)
    {
    	//System.out.println(name+"玩家回合结束);
    	System.out.println("");
    	surroundSmallOut("玩家"+name+"回合结束"+"本局累计总得分为"+totalScore,35);
        System.out.println(" ");
    }
    static public void playerGiveupOut(String name)
    {
        System.out.println("玩家"+name+"放弃投掷，玩家回合结束");
        System.out.println(" ");
    }
    static public void rollScoreOut(int rollScore)
    {
        System.out.println("本把得分为"+rollScore);
    }
    static public void rollPointOut(String name,int[] point,int dicesnum)
    {
    	System.out.println("玩家"+name+"选择投掷骰子");
        System.out.print("玩家"+name+"投掷出的骰子点数为");
        for(int i=0;i<dicesnum;i++)
        {
            System.out.print(point[i]+" ");
        }
        System.out.println(" ");
    }
    static public void nowTurnPlayer(String name,boolean type,int nowScore) {
    	surroundBigOut("当前进入玩家"+name+(type==true?"(Human)":"(AI)")+"回合，此前得分:"+nowScore);
    	
    }
    static public void winnerOut(String name)
    {
        System.out.println("玩家"+name+"达到3000分成为赢家，本局游戏结束");
    }
    static public void shuffledPlayerOut(String[] name,int playersnum)
    {
    	System.out.println("裁判随机裁定的玩家次序为");
        for(int i=0;i<playersnum;i++) {
        	System.out.println('\t'+"第"+(i+1)+"位玩家:"+name[i]);
        }
        System.out.println("");
 
    }
    static public void nowTurnDicesTotal(int dicestotal) {
    	surroundSmallOut("当前剩余"+dicestotal+"颗骰子",15);
    //	System.out.println("当前剩余"+dicestotal+"颗骰子");
    }
    static public void waitingConfirm() {
    	kbin.nextLine();
    	kbin.nextLine();
    }
    static public void surroundBigOut(String output) {
    	//第一行
    	System.out.print("#");for(int i=1;i<=40;i++) System.out.print('=');System.out.println("#");
    	//输出内容
    	System.out.print("#");for(int i=1;i<=5;i++) System.out.printf(" ");
    	System.out.print(output);
    	for(int i=1;i<=30-output.length();i++) System.out.print(" ");System.out.println("#");
    	//第三行
    	System.out.print("#");for(int i=1;i<=40;i++) System.out.print('=');System.out.println("#");
    	System.out.println("");
    }
    static public void surroundSmallOut(String output,int length) {
    	//第一行
    	System.out.print("+");for(int i=1;i<=length;i++) System.out.print('-');System.out.println("+");
    	//输出内容
    	System.out.print("+");
    	System.out.print(output);
    	//for(int i=1;i<=length-output.length();i++) System.out.print(" ");
    	System.out.println("  +");
    	//第三行
    	System.out.print("+");for(int i=1;i<=length;i++) System.out.print('-');System.out.println("+");
    	//System.out.println("");
    }
}
