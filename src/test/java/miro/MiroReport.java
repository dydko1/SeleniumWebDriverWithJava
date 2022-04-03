package miro;

import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MiroReport {

    /*
    @BeforeTest
    public void setOutputDirectory(ITestContext context) {
        TestRunner runner = (TestRunner) context;
        String path=System.getProperty("user.dir");
        System.out.println(path);
        runner.setOutputDirectory(path+"/output-testng");
    }
    */

    @Test(priority = 1)
    public void getFirefox() {
        Reporter.log("Miro reporterxxxx");
        System.out.println("GetFirefox Method is running on Thread : Test1");
    }

    @Test(priority = 2)
    public void getChorme() {
        System.out.println("GetChrome Method is running on Thread : Test2");
    }

    @Test(priority = 3)
    public void getEdge() {
        System.out.println("GetEdge Method is running on Thread : Test3");
    }

    @Test(priority = 4)
    public void getIE() {
        System.out.println("GetIE Method is running on Thread : Test4");
    }
}