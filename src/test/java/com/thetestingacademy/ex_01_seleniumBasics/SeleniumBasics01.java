package com.thetestingacademy.ex_01_seleniumBasics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumBasics01 {

    @Test
    public void verify_Login_Page() {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());

    }
}
