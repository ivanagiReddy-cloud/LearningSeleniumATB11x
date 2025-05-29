package com.thetestingacademy.ex_02_seleniumBasics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumBasics05_Commands {


    @Test
    public void test_Method(){

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());

        driver.quit();

    }
}
