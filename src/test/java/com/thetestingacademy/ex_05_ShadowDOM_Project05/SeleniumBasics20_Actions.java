package com.thetestingacademy.ex_05_ShadowDOM_Project05;

import com.thetestingacademy.ex_02_seleniumBasics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumBasics20_Actions extends CommonToAll {

    @Test
    public void verify_Actions() {

        WebDriver driver = new EdgeDriver();
        openBrowser(driver, "https://awesomeqa.com/practice.html");

        WebElement username = driver.findElement(By.xpath("//input[@name='firstname']"));
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT)
                .sendKeys(username, "Sivanagi Reddy")
                .keyUp(Keys.SHIFT).build().perform();
    }
}
