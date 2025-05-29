package com.thetestingacademy.ex_02_seleniumBasics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumBasics06_min_Maximise {


    @Test
    public void test_Method() {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.close();
    }
}
