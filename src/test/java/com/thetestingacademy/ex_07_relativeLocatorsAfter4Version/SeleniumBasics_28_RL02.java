package com.thetestingacademy.ex_07_relativeLocatorsAfter4Version;

import com.thetestingacademy.ex_02_seleniumBasics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v134.overlay.model.LineStyle;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class SeleniumBasics_28_RL02 extends CommonToAll {

    @Test
    public void test_RL() throws InterruptedException {

        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
        WebElement searchbar = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        searchbar.sendKeys("india" + Keys.ENTER);

        Thread.sleep(7000);
        List<WebElement> locations = driver.findElements(By.xpath("//div[contains(@class,'location-name')]/p"));
        for (WebElement location : locations) {

            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(location)).getText();
            String AQI = driver.findElement(with(By.tagName("span")).toRightOf(location)).getText();

            System.out.println(rank + " |" + location.getText() + " |" + AQI);


        }

    }
}
