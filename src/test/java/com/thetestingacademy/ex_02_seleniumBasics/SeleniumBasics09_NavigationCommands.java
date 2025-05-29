package com.thetestingacademy.ex_02_seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumBasics09_NavigationCommands {

    @Test
    public void mini_Project(){

        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
    }
}
