package com.thetestingacademy.ex_04_mini_Project04;

import com.thetestingacademy.ex_02_seleniumBasics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumBasics16_OrangeHRM_mini_Project extends CommonToAll {


    @Test
    public void test_OrangeHRM() {

        WebDriver driver = new EdgeDriver();

        openBrowser(driver, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@name='Password']"));
        password.sendKeys("admin123");

        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));

        closeBrowser(driver);

    }
}
