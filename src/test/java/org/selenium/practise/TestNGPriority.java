package org.selenium.practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGPriority {
    @Test(priority = +1)
    public void runnerTest1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }


    @Test(priority = 0)
    public void runnerTest2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }


    @Test(priority = -1)
    public void runnerTest3() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
