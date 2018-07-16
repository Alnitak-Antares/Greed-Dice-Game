import java.util.Scanner;

public class ConfigureView {

    static private Scanner kbin = new Scanner(System.in);

    static public int getIfEnd()
    {
        return kbin.nextInt();
    }
    static public int getPlayerType()
    {
        return kbin.nextInt();
    }
    static public String getPlayerName()
    {
        return kbin.nextLine();
    }
}
