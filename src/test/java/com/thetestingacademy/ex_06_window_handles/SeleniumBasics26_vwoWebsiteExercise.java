package com.thetestingacademy.ex_06_window_handles;

import com.thetestingacademy.ex_02_seleniumBasics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class SeleniumBasics26_vwoWebsiteExercise extends CommonToAll {


    @Test
    public void windowHandles() throws InterruptedException {
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1&accountId=666400");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Heatmaps & Clickmaps']/parent::div/ul/li[2]/div[2]//img[1]")));

        WebElement variation1 = driver.findElement(By.xpath("//h2[text()='Heatmaps & Clickmaps']/parent::div/ul/li[2]/div[2]//img[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(variation1).click().build().perform();
        String parent = driver.getWindowHandle();
        Thread.sleep(5000);
        Set<String> windows = driver.getWindowHandles();
        for (String allWindows : windows) {
            if (!allWindows.equals(parent)) {
                driver.switchTo().window(allWindows);
                Thread.sleep(10000);
                driver.switchTo().frame("heatmap-iframe");
                WebElement mapLink = driver.findElement(By.xpath("//span[@data-qa='refoyekife']"));
                mapLink.click();
            }
        }
    }
}
