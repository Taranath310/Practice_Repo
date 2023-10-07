/**
 * User:Taranath
 * Date:19-09-2023
 * Time:17:51
 */


package org.selenium.practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureText {

    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://jqueryui.com/");
        for (WebElement ele: driver.findElements(By.xpath("//div[@id='sidebar']//a"))){
            System.out.println(ele.getText());
        }
    }
}
