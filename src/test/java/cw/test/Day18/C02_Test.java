package cw.test.Day18;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(C01_Listener.class)
public class C02_Test {

    @Test
    public void Successfulltest() {

        Assert.assertEquals(1,1);
    }
    @Test
    public void failedtest() {

        Assert.assertEquals(1,2);
    }


}
