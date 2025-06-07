package com.thetestingacademy.ex_05_ShadowDOM_ACTIONS_Project05;

import com.thetestingacademy.ex_02_seleniumBasics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;

public class SeleniumBasics23_FileUpload extends CommonToAll {

    @Test
    public void fileUpload() throws InterruptedException {

        driver.get("https://awesomeqa.com/practice.html");
        WebElement uploadimage = driver.findElement(By.xpath("//input[@class='input-file']"));

        String workingDir = System.getProperty("user.dir");
        String filePath = workingDir + File.separator+ "src/test/java/com/thetestingacademy/sample.jpg";
        uploadimage.sendKeys(filePath);
        Thread.sleep(3000);

    }
}
