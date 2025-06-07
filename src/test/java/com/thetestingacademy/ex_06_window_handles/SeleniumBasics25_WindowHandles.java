package com.thetestingacademy.ex_06_window_handles;

import com.thetestingacademy.ex_02_seleniumBasics.CommonToAll;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class SeleniumBasics25_WindowHandles extends CommonToAll {

    @Test
    public void windows_handle() {

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Click Here']")));

        String parent = driver.getWindowHandle();
        System.out.println(parent);
        WebElement clickhere = driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickhere.click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles){
            driver.switchTo().window(handle);
            if (driver.getPageSource().contains("New Window")){
                System.out.println("Test case is Passed!");
            }
        }
        driver.switchTo().window(parent);


    }
}
