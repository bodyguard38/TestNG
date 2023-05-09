package cw.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task01 {
    /*
    Create a class.
    Create 2 test methods.
    Use TestNG annotations that can be used in the class.
    Interpret output in console.

     */
    protected WebDriver driver;
    @BeforeMethod
    public void Base() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void test1() {

        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Google"));
    }
    @Test
    public void test2() {
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
