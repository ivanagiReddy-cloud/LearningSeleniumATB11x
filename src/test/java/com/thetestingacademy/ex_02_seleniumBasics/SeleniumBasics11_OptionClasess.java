package com.thetestingacademy.ex_02_seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class SeleniumBasics11_OptionClasess {

    @Test
    public void optionClasses() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        //edgeOptions.addArguments("--start-maximized"); // optional but useful
        edgeOptions.addArguments("--incognito");

        WebDriver driver = new EdgeDriver(edgeOptions);

        Thread.sleep(5000);
        driver.quit();
    }
}
