package cw.Practice;

import cw.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Task04 {
    
    /*
    Go to URL: https://www.amazon.com
    Search words: Java, Selenium
    Assert get text result est that the result text contains the searched Word.
    Run tests from XML file.
     */

    @Test(dataProvider = "getdata")
    public void SearchWords(String input) {

        Driver.getDriver().get("https://www.amazon.com/");
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys(input+ Keys.ENTER);

        TextResult(input);
    }

    private void TextResult(String input) {

        String elementText = Driver.getDriver().findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
        Assert.assertTrue(elementText.contains(input));

    }

    @DataProvider
    public Object[][] getdata(){

        return new Object[][]{
                {"Java"},
                {"Selenium"}
        };
    }
}
