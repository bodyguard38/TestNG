package cw.Practice;

import cw.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Task03 {

    /*
    Open the site: http://opencart.abstracta.us/index.php?route=account/login
    Login with that credentials
    Email: clarusway@gmail.com
    Password: 123456789
    Using the Search function do it with Data Provider for Mac, iPad and Samsung.
     */

    @Test(dataProvider="getData")
    public void test01(String file) {

        Driver.getDriver().get("http://opencart.abstracta.us/index.php?route=account/login");

        Driver.getDriver().findElement(By.id("input-email")).sendKeys("clarusway@gmail.com");
        Driver.getDriver().findElement(By.id("input-password")).sendKeys("123456789");

        Driver.getDriver().findElement(By.xpath("//input[@value=\"Login\"]")).click();

        Driver.getDriver().findElement(By.xpath("//input[@name='search']")).sendKeys(file+ Keys.ENTER);
    }
    @DataProvider
    public Object [][] getData() {

        return new Object [][]{
                {"Mac"},
                {"iPad"},
                {"Samsung"},
        };

    }
}
