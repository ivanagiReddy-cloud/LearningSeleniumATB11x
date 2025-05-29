package com.thetestingacademy.ex_03_seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumBasics14_Project3 {

    @Test
    public void freeTrailLink() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        WebElement partialLink = driver.findElement(By.partialLinkText("trial"));
        partialLink.click();

        String currentUrl = driver.getCurrentUrl();
        //Verifying the current url
        Assert.assertTrue(currentUrl.contains("free-trial"));

        driver.findElement(By.id("page-v1-step1-email")).sendKeys("abc");
        driver.findElement(By.name("gdpr_consent_checkbox")).click();

        driver.findElement(By.tagName("button")).click();

        String error = driver.findElement(By.className("invalid-reason")).getText();
        Assert.assertEquals(error,"The email address you entered is incorrect.");

        driver.quit();


    }
}
