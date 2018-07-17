package greed_game;
import java.util.Scanner;

public class ConfigureView {

    static public Scanner kbin = new Scanner(System.in);
    static public void startConfigure() {
    	surroundOut("Greed骰子游戏");
    }
    static public boolean getIfEnd()
    {
    	askingOut("是否增加一个玩家？y/n(选择否则开始游戏)");
        //  System.out.println("是否停止设置并开始游戏？y/n");
        String c=kbin.next();
        boolean stop = c.contains("n");
        return stop;

    }
    static public int getPlayerType()
    {
        System.out.println("请输入玩家类型(0表示HUMan,1表示AI)：");
        return kbin.nextInt();
    }
    static public String getPlayerName()
    {
        System.out.println("请输入玩家名字：");
        String c=kbin.next();
        return c;
    }
    static public void startGame()
    {
    	surroundOut("greed游戏开始");
    }
    static public void errorInput(int errorid) {
    	System.out.print("ERROR:");
    	switch (errorid) {
    	case 1:{
    		System.out.println("请至少设置两名玩家参加游戏");
    		break;
    	}
    	case 2:{
    		System.out.println("玩家最多为十人");
    	}
    	}
    	System.out.println("");
    }
    static public void surroundOut(String output) {
    	//第一行
    	System.out.print("#");for(int i=1;i<=50;i++) System.out.print('=');System.out.println("#");
    	//第二行
    	System.out.print("#");for(int i=1;i<=50;i++) System.out.printf(" ");System.out.println("#");
    	//输出内容
    	System.out.print("#");for(int i=1;i<=10;i++) System.out.printf(" ");
    	System.out.print(output);
    	for(int i=1;i<=50-output.length();i++) System.out.print(" ");System.out.println("#");
    	//第四行
    	System.out.print("#");for(int i=1;i<=50;i++) System.out.printf(" ");System.out.println("#");
    	//第五行
    	System.out.print("#");for(int i=1;i<=50;i++) System.out.print('=');System.out.println("#");
    	System.out.println("");
    }
    static public void askingOut(String output) {
    	//第一行
    	System.out.print("#");for(int i=1;i<=50;i++) System.out.print('-');System.out.println("#");
    	//输出内容
    	System.out.print("#");for(int i=1;i<=10;i++) System.out.printf(" ");
    	System.out.print(output);
    	for(int i=1;i<=50-output.length();i++) System.out.print(" ");System.out.println("#");
    	//第三行
    	System.out.print("#");for(int i=1;i<=50;i++) System.out.print('-');System.out.println("#");
    	System.out.println("");
    }
}
