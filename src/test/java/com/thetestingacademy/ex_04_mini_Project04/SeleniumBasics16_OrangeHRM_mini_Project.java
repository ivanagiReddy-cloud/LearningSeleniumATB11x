package com.thetestingacademy.ex_04_mini_Project04;

import com.thetestingacademy.ex_02_seleniumBasics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumBasics16_OrangeHRM_mini_Project extends CommonToAll {


    @Test
    public void test_OrangeHRM() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        openBrowser(driver, "https://awesomeqa.com/hr/web/index.php/auth/login");
        Thread.sleep(5000);
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Hacker@4321");

        WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        login.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("viewEmployeeList"));

        closeBrowser(driver);

    }
}
