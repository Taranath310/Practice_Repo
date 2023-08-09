package org.selenium.practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class NotificationPopUp {
    @Test()
    public void runnerTest1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yatra.com/");
        //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        driver.findElement(By.xpath("//a[text()=' Yatra for Business ']")).click();
        driver.navigate().back();
        Thread.sleep(15000);
        actions.keyDown(Keys.TAB).perform();
        actions.keyUp(Keys.TAB).perform();
        actions.keyDown(Keys.ENTER).perform();
        actions.keyUp(Keys.ENTER).perform();

//        actions.keyDown(Keys.TAB);
//        actions.keyUp(Keys.TAB);
//        actions.keyDown(Keys.ENTER);
//        actions.keyUp(Keys.ENTER);


    }
}
