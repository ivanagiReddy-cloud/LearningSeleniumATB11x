package com.thetestingacademy.ex_02_seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumBasics08_MiniProject extends CommonToAll {

    @Test
    public void selenium_01() throws Exception {

        WebDriver driver = new EdgeDriver();
        openBrowser(driver, "https://katalon-demo-cura.herokuapp.com/");

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Test Case is passed!");
            Assert.assertTrue(true);
        }else {
            Assert.fail("CURA Healthcare Service is not Visible");
            //throw new Exception("CURA Healthcare Service is not Visible");
        }

        closeBrowser(driver);
    }


}
