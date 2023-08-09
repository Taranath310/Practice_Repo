package org.selenium.practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ParameterizationFromXml {
    WebDriver driver;

    @Parameters("browser")
    @BeforeMethod()
    public void openBrowser(@Optional("chrome") String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            WebDriverManager.chromedriver().setup();
            driver = new EdgeDriver();
        }
    }

    @Parameters("url")
    @Test()
    public void runnerTest1(String url) {
        driver.get(url);
        System.out.println(driver.getTitle());
    }

    @Parameters("url")
    @Test()
    public void runnerTest2(String url) {
        driver.get(url);
        System.out.println(driver.getTitle());
    }

    @Parameters("url")
    @Test()
    public void runnerTest3(String url) {
        driver.get(url);
        System.out.println(driver.getTitle());
    }

    @AfterMethod()
    public void closeBrowser() {
        driver.quit();
    }
}
