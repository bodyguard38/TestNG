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


        /*
    before suite
    before test
    before class
    before method
    test case 1
    after method
    before method
    test case 2
    after method
    after class
    after test
    after suite
    */


         /*
    her zaman Suite'in yürütülmesinden başlar ve ardından yöntemin yürütülmesiyle sona erer. TestNG Ek Annotations bu şekilde kullanılır.
    TestNG Annotations, test komut dosyasındaki yöntemlerin akışını kontrol etmek için kullanılan programa veya iş mantığına eklenen bir kod grubunu tanımlamak için kullanılır.
    Selenium test komut dosyalarını daha yönetilebilir, sofistike ve etkili hale getirirler.
    Bunları kullanmak, test edenler için son derece yararlıdır ve hayatlarını çok daha kolay hale getirir.
    /*
         @BeforeClass -> // Her Classdan önce çalışacaklar buraya yazılıyor.
           @BeforeMethod -> //Her metod çalışmadan önce yapılacakları buraya yazıyoruz
               @Test -> // testimizin metodları
               @Test -> // testimizin metodları
           @AfterMethod  -> // Her metod çalıştıktan sonra yapılacakları buraya yazıyoruz.
         @AfterClass -> // Her class dan sonra yapıalcaklar buraya yazılıyor.
   */

}
