package com.thetestingacademy.ex_05_ShadowDOM_ACTIONS_Project05;

import com.thetestingacademy.ex_02_seleniumBasics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumBasics22_Actions03 extends CommonToAll {


    @Test
public void actions_Drag_Drop(){
    driver.get("https://the-internet.herokuapp.com/drag_and_drop");

    WebElement col1 = driver.findElement(By.xpath("//div[@id='column-a']"));
    WebElement col2 = driver.findElement(By.xpath("//div[@id='column-b']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(col1,col2).build().perform();


}
}
