package com.thetestingacademy.ex_05_ShadowDOM_Project05;

import com.thetestingacademy.ex_02_seleniumBasics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumBasics19_ShadowDOM extends CommonToAll {

    @Test
    public void shadowDOMtest() {

        //refresh the browser window= js.executeScript(“location.reload()”);
        // Send text = js.executeScript(“document.getElementByID(‘element id ’).value = ‘xyz’;”);
        //Generate Alert popu = Js.executeScript("alert('hello world');");
        // get InnerText = string sText =  js.executeScript("return document.documentElement.innerText;").toString();

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://selectorshub.com/xpath-practice-page/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='userName']")));
        WebElement scrolltoUsername = driver.findElement(By.xpath("//div[@id='userName']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scrolltoUsername);

        WebElement username = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"input#kils\")");
        username.sendKeys("Siva");

        WebElement pizzaBox = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"input#pizza\")");
        pizzaBox.sendKeys("mcdonalds");


        String url = js.executeScript("return document.URL").toString();
        System.out.println(url);
        String title = js.executeScript(" return document.title").toString();
        System.out.println(title);
        js.executeScript("window.scrollBy(0,150)");


    }
}
