package cw.Practice;

import cw.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task03  {

    /*
    Test Case1: Positive Login Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username student into Username field
    Type password Password123 into Password field
    Puch Submit button.
    Verify new page URL contains practicetestautomation.com/logged-in-successfully/
    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
    Verify button Log out is displayed on the new page.
    */

    @Test
    public void testCase01() {

        Driver.getDriver().get("https://practicetestautomation.com/practice-test-login/");

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Driver.getDriver().findElement(By.id("username")).sendKeys("student");
        Driver.getDriver().findElement(By.id("password")).sendKeys("Password123");
        Driver.getDriver().findElement(By.id("submit")).click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("logged-in-successfully"));
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h1[@class=\"post-title\"]")).getText().contains("Logged"));
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement logOutButton =Driver.getDriver().findElement(By.xpath("//a[@href=\"https://practicetestautomation.com/practice-test-login/\"]"));
        Assert.assertTrue(logOutButton.isDisplayed());

    }
}
