package org.selenium.practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class GetDisabledCheckBox {
    @Test()
    public void runnerTest() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.fireflink.com/signin");
        driver.findElement(By.name("emailId")).sendKeys("taranath.r@fireflink.com");
        driver.findElement(By.name("password")).sendKeys("Password@123");
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Sample Project']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='fancytree-expander']")).click();
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.xpath("(//span[@class='fancytree-checkbox'])[3]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
        TakesScreenshot ts=(TakesScreenshot) driver;
        File SrcFile = ts.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("C:\\Users\\User\\OneDrive\\Desktop\\New folder\\test.png");
        FileUtils.copyFile(SrcFile, DestFile);
        Thread.sleep(5000);
       // System.out.println(driver.getTitle());
        //driver.quit();
    }
}
