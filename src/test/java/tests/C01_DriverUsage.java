package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

public class C01_DriverUsage {

    //    Go to URL: https://opensource-demo.orangehrmlive.com/
//    Verify title is OrangeHRM.
//    Use Driver Class.

    @Test
    public void verifyTitle() {

        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");

        String title = Driver.getDriver().getTitle();
        Assert.assertEquals(title, "OrangeHRM", "Test failed. Title is not OrangeHRM..");

        Driver.closeDriver();
    }
}
