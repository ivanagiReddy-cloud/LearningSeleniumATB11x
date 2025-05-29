package com.thetestingacademy.ex_03_seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumBasics13_LT_PLT_CSS {


    @Test
    public void linked_Partial_Text() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        //LinkedText
        WebElement linkedTetx = driver.findElement(By.linkText("Start a free trial"));
        linkedTetx.click();

        //Partial Linked Text
        WebElement partial_LT = driver.findElement(By.partialLinkText("trial"));
        partial_LT.click();

        driver.quit();
    }
}
