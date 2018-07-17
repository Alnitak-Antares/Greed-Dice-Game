import java.util.Scanner;

public class ConfigureView {

    static public Scanner kbin = new Scanner(System.in);
    static public void intoGreed() {
    	surroundOut("Greed骰子游戏",70);
    }
    static public void endGreed() {
    	surroundOut("Greed骰子游戏结束",70);
    }
    static public void startConfigure() {
    	surroundOut("游戏配置",50);
    }
    static public boolean getIfNextGreedGame()
    {
    	System.out.println("");
    	System.out.println("");
    	askingOut("是否再来一局？y/n");
        //  System.out.println("是否停止设置并开始游戏？y/n");
        String c=kbin.next();
        boolean next = c.contains("y");
        return next;

    }
    static public boolean getIfEnd()
    {
    	askingOut("是否增加一个玩家？y/n(选择否则开始游戏)");
        //  System.out.println("是否停止设置并开始游戏？y/n");
    	boolean flag=false;
    	String c;
    	do {
    		c=kbin.next();
    		if (c.contains("y") || c.contains("Y") || c.contains("n") || c.contains("N")) flag=true;
    		if (flag==false) System.out.println("Input Error,请再次输入");
    	}while (flag==false);
        boolean stop = c.contains("n");
        return stop;

    }
    static public int getPlayerType()
    {
        System.out.println("请输入玩家类型(0表示Human,1表示AI)：");
        int type;
        boolean flag=false;
    	do {
    		type=kbin.nextInt();
    		if (type==0 || type==1) flag=true;
    		if (flag==false) System.out.println("Input Error,请再次输入");
    	}while (flag==false);
        return type;
    }
    static public String getPlayerName()
    {
        System.out.println("请输入玩家名字：");
        String c=kbin.next();
        return c;
    }
    static public void startGame()
    {
    	surroundOut("greed游戏开始",50);
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
    static public void surroundOut(String output,int length) {
    	//第一行
    	System.out.print("#");for(int i=1;i<=length;i++) System.out.print('=');System.out.println("#");
    	//第二行
    	System.out.print("#");for(int i=1;i<=length;i++) System.out.printf(" ");System.out.println("#");
    	//输出内容
    	System.out.print("#");for(int i=1;i<=length/3;i++) System.out.printf(" ");
    	System.out.print(output);
    	for(int i=1;i<=length-output.length()-length/3;i++) System.out.print(" ");System.out.println("#");
    	//第四行
    	System.out.print("#");for(int i=1;i<=length;i++) System.out.printf(" ");System.out.println("#");
    	//第五行
    	System.out.print("#");for(int i=1;i<=length;i++) System.out.print('=');System.out.println("#");
    	System.out.println("");
    }
    static public void askingOut(String output) {
    	//第一行
    	System.out.print("#");for(int i=1;i<=50;i++) System.out.print('-');System.out.println("#");
    	//输出内容
    	System.out.print("#");for(int i=1;i<=10;i++) System.out.printf(" ");
    	System.out.print(output);
    	for(int i=1;i<=40-output.length();i++) System.out.print(" ");System.out.println("#");
    	//第三行
    	System.out.print("#");for(int i=1;i<=50;i++) System.out.print('-');System.out.println("#");
    	System.out.println("");
    }
}
