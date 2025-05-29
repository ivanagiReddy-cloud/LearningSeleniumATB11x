package com.thetestingacademy.ex_03_seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumBasics12_Project2 {

    @Test
    public void verify_Login() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        /// Username
        WebElement username = driver.findElement(By.id("login-username"));
        username.sendKeys("admin@gmail.com");
        //Password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("223442");
        //Login Button
        WebElement login = driver.findElement(By.id("js-login-btn"));
        login.click();

        Thread.sleep(3000);

        WebElement errorMesg = driver.findElement(By.id("js-notification-box-msg"));
        String act_message = errorMesg.getText();
        System.out.println(act_message);
        Assert.assertEquals(act_message, "Your email, password, IP address or location did not match");

        driver.quit();
    }
}
