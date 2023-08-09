package org.selenium.practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TabActionOnWebsite {
    @Test
    public void testRunner() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.fireflink.com/signin");
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.TAB).perform();
        actions.keyUp(Keys.TAB).perform();
        actions.keyDown(Keys.TAB).perform();
        actions.keyUp(Keys.TAB).perform();
    }
}
