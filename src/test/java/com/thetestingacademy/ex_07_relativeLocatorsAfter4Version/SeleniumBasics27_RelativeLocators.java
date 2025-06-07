package com.thetestingacademy.ex_07_relativeLocatorsAfter4Version;

import com.thetestingacademy.ex_02_seleniumBasics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class SeleniumBasics27_RelativeLocators extends CommonToAll {

    @Test
    public void test_RelativeLoc(){

        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();
        WebElement years= driver.findElement(By.xpath("//span[text()='Years of Experience']"));
        driver.findElement(with(By.id("exp-5")).toRightOf(years)).click();
    }
}
