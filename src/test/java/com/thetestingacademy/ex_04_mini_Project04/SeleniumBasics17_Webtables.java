package com.thetestingacademy.ex_04_mini_Project04;

import com.thetestingacademy.ex_02_seleniumBasics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SeleniumBasics17_Webtables extends CommonToAll {


    @Test
    public void webTables() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('fixedban').remove();");
        List<WebElement> svg_Elements = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svg_Elements.get(0).click();

        WebElement table = driver.findElement(By.xpath("//li[@id='item-3']//span[contains(@class,'text') and text()='Web Tables']"));
        table.click();

        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            // Click 'Add' button
            driver.findElement(By.id("addNewRecordButton")).click();

            // Fill the form with random data
            driver.findElement(By.id("firstName")).sendKeys("User" + i);
            driver.findElement(By.id("lastName")).sendKeys("Test" + i);
            driver.findElement(By.id("userEmail")).sendKeys("user" + i + "@example.com");
            driver.findElement(By.id("age")).sendKeys(String.valueOf(20 + random.nextInt(30))); // 20–50
            driver.findElement(By.id("salary")).sendKeys(String.valueOf(30000 + random.nextInt(50000))); // 30k–80k
            driver.findElement(By.id("department")).sendKeys("Dept" + random.nextInt(10)); // Dept0–Dept9

            // Submit the form
            driver.findElement(By.id("submit")).click();

            Thread.sleep(500); // Small delay between records
        }

        System.out.println("✅ 30 random records added successfully!");
        driver.quit();
    }
}
