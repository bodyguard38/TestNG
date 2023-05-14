package cw.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    public static Object getDriver;
    private static WebDriver driver;

    public static WebDriver getDriver() {
        //todo getDriver methoduna cross browser yetisi ekle

        //driver objemiz olusmadiysa driver i olustur.

        if(driver == null) {
            WebDriverManager.chromedriver().setup();
            driver =new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }
    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

}
