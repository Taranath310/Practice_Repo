package org.selenium.practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgPractise {
    @Test()//invocationCount = 2, threadPoolSize = 2, timeOut = 50000
    public void runnerTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }

    @DataProvider(name = "setData", parallel = true)
    public Object[][] dataProviderSet() {
        Object[][] obj = new Object[4][1];
        obj[0][0] = "https://www.youtube.com/";
        obj[1][0] = "https://www.amazon.in/";
        obj[2][0] = "https://www.flipkart.com/";
        obj[3][0] = "https://www.myntra.com/";
        return obj;
    }

    @Test(dataProvider = "setData")
    public void runnerTest2(String url) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        System.out.println(driver.getTitle());
        driver.quit();
    }


    @Test(dataProvider = "setDataFromDiffrentClass", dataProviderClass = DataProviderPractise.class)
    public void runnerTest3(String url) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        System.out.println(driver.getTitle());
        driver.quit();
    }


    @Test()
    public void runnerTest4() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
    @Test(dependsOnMethods = "runnerTest4")
    public void runnerTest5() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=4U_HbGOrC-w&t=621s");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
