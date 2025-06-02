package com.thetestingacademy.ex_05_ShadowDOM_Project05;

import com.thetestingacademy.ex_02_seleniumBasics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumBasics21_Actions02 extends CommonToAll {


    @Test
    public void verify_Actions02() {

        WebDriver driver = new EdgeDriver();
        openBrowser(driver, "https://www.spicejet.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
        Actions actions = new Actions(driver);
        actions.moveToElement(source).click().sendKeys("BLR").build().perform();


    }
}
