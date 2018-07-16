import java.util.Scanner;

public class ConfigureView {

    static private Scanner kbin = new Scanner(System.in);

    static public boolean getIfEnd()
    {
        System.out.println("是否停止设置并开始游戏？y/n");
        boolean stop = (char)(kbin.nextByte()) == 'y';
        if(stop == true)
        System.out.println("——游戏开始——");
        return stop;

    }
    static public int getPlayerType()
    {
        System.out.println("请输入玩家类型：");
        return kbin.nextInt();
    }
    static public String getPlayerName()
    {
        System.out.println("请输入玩家名字：");
        return kbin.nextLine();
    }
}
