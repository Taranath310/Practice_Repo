package org.selenium.practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
@Test(groups = {"all"})
public class GroupsPractise {
    @Test(groups = {"sanity"})
    public void runnerTest1() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("headless");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }


    @Test(groups = {"somke","windows.chrome"})
    public void runnerTest2() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("headless");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.flipkart.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }


    @Test(groups = {"regression","windows.firefox"})
    public void runnerTest3() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("headless");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.amazon.in/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
