package cw.Practice;

import cw.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Task01 {
    /*
    Open the site: https://www.amazon.com/
    Search the following keys with DataProvider:
    Java
    JavaScript
    Phyton
     */


    @Test(dataProvider = "data")
    public void test01(String a){

        Driver.getDriver().get("https://www.amazon.com/");
        WebElement searchBox=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(a+ Keys.ENTER);

    }

    @DataProvider
    public Object[][] data(){

        Object[][] data = new Object[3][1];

        data[0] = new Object[]{"Java"};
        data[1] = new Object[]{"JavaScript"};
        data[2] = new Object[]{"Phyton"};

    return data;

    }
}
