package com.thetestingacademy.ex_01_seleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumBasics02 {

    @Description("Open the app.vwo.com website and verify Title")
    @Test
    public void seleniumBasics03() {


        EdgeDriver driver = new EdgeDriver();
        // new EdgeDriver()-> POST Request(Browser Driver)
        //Create New Session Endpoint-? 16 digit Unique ID will create

        //Navigate to URL-> GET Request
        driver.get("https://app.vwo.com");

        Assert.assertEquals(driver.getTitle(),"'Login - VWO'");

        driver.quit();

    }
}
