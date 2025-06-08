package com.thetestingacademy.ex_08_DataDrivenTesting_POI;

import com.thetestingacademy.ex_02_seleniumBasics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumBasics_30_ActualCode extends CommonToAll {

    @Test(dataProvider = "getData")
    public void test_Excel_POI(String user, String pass) throws InterruptedException {


        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        Thread.sleep(5000);

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys(user);
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(pass);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Invalid credentials']")));
        WebElement error = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
        Assert.assertEquals(error.getText(),"Invalid credentials");
    }


    @DataProvider
    public Object[][] getData() {
        return SeleniumBasics_31_utils.getSheetFromExcel("Sheet1");
    }
}
