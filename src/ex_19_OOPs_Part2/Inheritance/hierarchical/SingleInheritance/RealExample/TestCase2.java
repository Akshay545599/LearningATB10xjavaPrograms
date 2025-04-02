package ex_19_OOPs_Part2.Inheritance.hierarchical.SingleInheritance.RealExample;

    public class TestCase2 extends CommonToAllTests{
        void runningTC2(){
            startBrowser();
            readExcelFile();
            readDataBaseFile();
            System.out.println("Running TC2");
            closeBrowser();
        }


}
