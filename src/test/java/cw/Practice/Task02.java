package cw.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task02 {

    /*
    Create tests that depend on each other
    Create beforeClass and set up settings.
    By creating interdependent tests;
    First go to Facebook.
    Then go to Google depending on Facebook,
    Then go to Amazon depending on Google
    Close the driver.
    */
    protected WebDriver driver;
    @BeforeMethod
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

     }

    @Test
    public void test01() {
        driver.get("https://www.facebook.com/");
    }
    @Test(dependsOnMethods ={"test01"})
    public void test02() {
        driver.get("https://www.google.com/");
    }
    @Test(dependsOnMethods ={"test02"})
    public void test03() {
        driver.get("https://www.amazon.com/");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
