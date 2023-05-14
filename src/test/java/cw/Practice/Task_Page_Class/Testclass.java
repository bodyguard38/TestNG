package cw.Practice.Task_Page_Class;

import cw.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;


public class Testclass {
    /*
    Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    Fill in capitals by country.

     */

    @Test
    public void test01() {

        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Page_homework pg = new Page_homework();
        Actions action = new Actions(Driver.getDriver());


        action.dragAndDrop(pg.oslo,pg.norway)
              .dragAndDrop(pg.copenhagen,pg.denmark )
              .dragAndDrop(pg.roma,pg.italy)
              .dragAndDrop(pg.washington,pg.unitedState)
              .dragAndDrop(pg.soeul,pg.southKorea)
              .dragAndDrop(pg.madrid,pg.spain)
              .dragAndDrop(pg.stockholm,pg.sweden).perform();


    }


}
