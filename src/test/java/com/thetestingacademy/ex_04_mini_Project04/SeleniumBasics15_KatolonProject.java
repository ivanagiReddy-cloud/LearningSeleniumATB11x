package com.thetestingacademy.ex_04_mini_Project04;

import com.thetestingacademy.ex_02_seleniumBasics.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumBasics15_KatolonProject extends CommonToAll {

    @Owner("Siva")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Login paage and make apointment")
    @Test
    public void test_LoginPage() {

        WebDriver driver = new EdgeDriver();
        openBrowser(driver, "https://katalon-demo-cura.herokuapp.com/");
        WebElement make_appoint = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make_appoint.click();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));

        WebElement username = driver.findElement(By.xpath("//input[@id='txt-username']"));
        username.sendKeys("John Doe");

        List<WebElement> password = driver.findElements(By.xpath("//input[@placeholder='Password']"));

        password.get(1).sendKeys("ThisIsNotAPassword");

        WebElement login = driver.findElement(By.xpath("//button[@id='btn-login']"));
        login.click();

        String cuurenturl = driver.getCurrentUrl();
        System.out.println(cuurenturl);
        Assert.assertTrue(cuurenturl.contains("appointment"));

        closeBrowser(driver);

    }
}
