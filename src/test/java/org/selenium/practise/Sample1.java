package org.selenium.practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1 {

    @Test(invocationCount = 2, threadPoolSize = 4)
    public void runnerTest1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }

    @Test(threadPoolSize = 2)
    public void runnerTest2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }

    @Test(timeOut = 50000)
    public void runnerTest3() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }

    @Test(enabled = false)
    public void runnerTest4() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }

    @Test(priority = 1)
    public void runnerTest5() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
  
}
