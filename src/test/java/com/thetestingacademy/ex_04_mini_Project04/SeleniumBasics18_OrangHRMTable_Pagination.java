package com.thetestingacademy.ex_04_mini_Project04;

import com.thetestingacademy.ex_02_seleniumBasics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SeleniumBasics18_OrangHRMTable_Pagination extends CommonToAll {


    @Test
    public void pagination() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://awesomeqa.com/hr/web/index.php/auth/login");
        Thread.sleep(5000);

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Hacker@4321");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("viewEmployeeList"));
//        Assert.assertTrue(driver.getCurrentUrl().contains("viewEmployeeList"));

        //Pagination
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,500)");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='PIM']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Employee List']"))).click();
        int page = 1;
        boolean hasNextpage = true;
        while (hasNextpage) {
            System.out.println("page :" + page);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".oxd-table-body")));


            List<WebElement> rows = driver.findElements(By.cssSelector(".oxd-table-body .oxd-table-card"));

            for (WebElement row : rows) {
                String text = row.getText();
                System.out.println(text);
            }

           List<WebElement> next_button = driver.findElements(By.xpath("//button//i[@class='oxd-icon bi-chevron-right']"));
            if (next_button.size()>0) {
                WebElement next_page = next_button.get(0);
                if (next_page.isEnabled()) {
                    next_page.click();
                    Thread.sleep(5000);
                    page++;

                } else {
                    hasNextpage = false;
                }
            }
            else {
                hasNextpage = false;
            }
        }
        closeBrowser(driver);
    }




}
