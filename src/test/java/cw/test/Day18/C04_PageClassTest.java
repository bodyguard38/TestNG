package cw.test.Day18;

import cw.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C04_PageClassTest {

    @Test
    public void beforePageClass() {

        Driver.getDriver().get("https://linkedin.com/login/");

        WebElement email = Driver.getDriver().findElement(By.id("username"));
        email.sendKeys("ahmet@hotmail.com");

        WebElement password = Driver.getDriver().findElement(By.id("password"));
        password.sendKeys("abc123");

        WebElement button = Driver.getDriver().findElement(By.xpath("//button[@aria-label='Sign in']"));


    }

    @Test
    public void withPageClass() {

        Driver.getDriver().get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");

        C03_LinkedinLoginPage lp = new C03_LinkedinLoginPage();

        lp.email.sendKeys("ahmet@hotmail.com");
        lp.password.sendKeys("abc123");
        lp.signIn.click();
        String errorMessage = lp.errorMessage.getText();
        Assert.assertTrue(errorMessage.contains("Dit is niet het juiste wachtwoord"));

        Driver.closeDriver();

    }
}
