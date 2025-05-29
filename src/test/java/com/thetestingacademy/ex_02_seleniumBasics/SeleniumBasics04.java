package com.thetestingacademy.ex_02_seleniumBasics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumBasics04 {

    @Test
    public void checkMultilevelInheritance(){

        // All Possible
        SearchContext driver1 = new ChromeDriver();
        WebDriver driver2= new ChromeDriver();
        RemoteWebDriver driver3 = new ChromeDriver();

        //Scenario1
        ChromeDriver driver4 = new ChromeDriver();
        //Scenario2
        // i want to run on chrome and change to another browser

        WebDriver driver5 = new ChromeDriver();
        driver5 = new EdgeDriver();
        driver5 = new FirefoxDriver();

        driver5.quit();


    }
}
