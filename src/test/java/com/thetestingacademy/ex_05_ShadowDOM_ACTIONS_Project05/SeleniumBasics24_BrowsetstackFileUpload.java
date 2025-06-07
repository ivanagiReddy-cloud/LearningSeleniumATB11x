package com.thetestingacademy.ex_05_ShadowDOM_ACTIONS_Project05;

import com.thetestingacademy.ex_02_seleniumBasics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

public class SeleniumBasics24_BrowsetstackFileUpload extends CommonToAll {

    @Test
    public void verifyFileUpload() throws InterruptedException {

        driver.get("https://www.browserstack.com/users/sign_in");
        WebElement username = driver.findElement(By.xpath("//input[@id='user_email_login']"));
        username.sendKeys("sivanagi.muli@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='user_password']"));
        password.sendKeys("Parnika@2024");

        Thread.sleep(3000);
        WebElement login = driver.findElement(By.xpath("//input[@value='Sign me in']"));
        login.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[span[text()='UPLOAD APP']]")));
        WebElement uploadfile = driver.findElement(By.xpath("//button[span[text()='UPLOAD APP']]"));
        String workingDir = System.getProperty("user.dir");
        String filePath = workingDir + File.separator + "src/test/java/com/thetestingacademy/APKPure.apk";

        uploadfile.sendKeys(filePath);
    }
}
