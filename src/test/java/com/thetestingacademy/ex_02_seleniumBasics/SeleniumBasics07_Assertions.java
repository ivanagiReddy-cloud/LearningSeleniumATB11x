package com.thetestingacademy.ex_02_seleniumBasics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class SeleniumBasics07_Assertions {


    @Test
    public void test_Method(){

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().minimize();

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        assertThat(driver.getTitle()).isNotNull().isEqualTo("Login - VWO");

        driver.quit();

    }
}
