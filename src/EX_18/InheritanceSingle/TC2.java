package EX_18.InheritanceSingle;

public class TC2 extends CommonToAll {
    void RunningTC2()
    {
        openBrowser();
        System.out.println("TC2 running...");
        ReadDatabaseFile();
        ReadExcelFile();
        closeBrowser();

    }


}
