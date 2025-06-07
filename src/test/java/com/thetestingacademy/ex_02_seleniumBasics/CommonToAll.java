package com.thetestingacademy.ex_02_seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class CommonToAll {

    public WebDriver driver;
    public void openBrowser(WebDriver driver, String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closeBrowser(WebDriver driver){
        driver.quit();
    }

    @BeforeTest
    public void setUp(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }


    public void tearDown(){
        driver.quit();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
