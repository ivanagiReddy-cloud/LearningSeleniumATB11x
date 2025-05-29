package com.thetestingacademy.ex_02_seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumBasics10_ClosevsQuit {

    @Test
    public void closeVsQuit() {

        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");

        driver.close();
        //driver.quit();

    }
}

