package cw.Practice;

import cw.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Task02 {

    /*
    Go to URL: https://opensource-demo.orangehrmlive.com/
    Login with negative credentilas by Data Provider.
    Then assert that ‘’Invalid credentials’’ is displayed.
     */


    @Test(dataProvider="Data")
    public void test01(String userName,String Password) {

        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");

        Driver.getDriver().findElement(By.xpath("(//input[contains(.,username)])[2]")).sendKeys(userName);
        Driver.getDriver().findElement(By.xpath("((//input[contains(.,Password)]))[3]")).sendKeys(Password);

        Driver.getDriver().findElement(By.tagName("button")).click();

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//p[text()='Invalid credentials']")).isDisplayed());

    }

    @DataProvider
    public Object[][] Data() {

        Object[][] data = new Object[7][2];
            //Admin,admin123

        data[0] = new Object[]{"ADMIN","admin123"};
        data[1] = new Object[]{"Admine","admin123"};
        data[2] = new Object[]{"Adminde","admin123"};
        data[3] = new Object[]{"Admin","admin"};
        data[4] = new Object[]{"Admin","admin12"};
        data[5] = new Object[]{"Admi","admin1234"};
        data[6] = new Object[]{"admi","admin123"};


        return data;
    }
}
