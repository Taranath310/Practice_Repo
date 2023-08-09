package org.selenium.practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

/* -----------------------------------------------------------
Here in WebDriver interface we have 11 + 2 abstract methods we are implemented in remoteWebDriver class,
so we have
1. get()
2. getCurrentUrl()
3. getTitle()
4. getPageSource()
5. navigate()
6. manage()
7. getWindowHandle()
8. getWindowHandles()
9. close()
10. quit()
11. switchTo()

+

1. findElement()
2. findElements()

 */
public class WebDriverPractise {
    @Test
    public void testRunner() {
        WebDriverManager.chromedriver().setup();

        //to navigate to the website or web application we will use get()
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.7.1");
    }

//        //to get the title will use getTitle()
//        String webPageTitle = driver.getTitle();
//        System.out.println("webPageTitle : " + webPageTitle);
//
//        //to get the CurrentUrl will use getCurrentUrl()
//        String webPageCurrentUrl = driver.getCurrentUrl();
//        ;
//        System.out.println("webPageCurrentUrl : " + webPageCurrentUrl);
//
//        //to get the PageSource will use getPageSource()
//        String webPageSource = driver.getPageSource();
//        //System.out.println("webPageSource : "+webPageSource);
//
//        driver.findElement(By.xpath("//a[text()='Categories']")).click();
//
//        //navigate methods
//            /*
//            back()
//            forward()
//            refresh()
//            to(String url)
//            to(URL url)
//             */
//
//        //to backward
//        driver.navigate().back();
//        System.out.println("clicked on browser back button");
//
//        //to forward
//        driver.navigate().forward();
//        System.out.println("clicked on browser forward button");
//
//        //to refresh
//        driver.navigate().refresh();
//        System.out.println("clicked on browser refresh button");
//
//
//        //to navigate some other url
//        driver.navigate().to("https://www.youtube.com/");
//        System.out.println("navigated to youtube website");
//
//        //to navigate some other url
//        driver.navigate().to("https://demoqa.com/browser-windows");
//        System.out.println("navigated to qaTools website");
//
//        // manage methods
//
//        //windows related operation
//                    /*
//                    maximize()
//                    minimize()
//                    fullscreen()
//                    getPosition()
//                    setPosition()
//                    getSize()
//                    setSize()
//                     */
//
//        //maximize
//        driver.manage().window().maximize();
//        System.out.println("page got maximized");
//
//        //minimize
//        driver.manage().window().minimize();
//        System.out.println("page got minimized");
//
//        //fullscreen
//        driver.manage().window().fullscreen();
//        System.out.println("page is in fullscreen mode");
//
//        //getSize with height and width
//        Dimension size = driver.manage().window().getSize();
//        System.out.println("page size is: width -" + size.width + " height -" + size.height);
//
//        //setSize
//        Dimension setSize = new Dimension(90, 80);
//        driver.manage().window().setSize(setSize);
//
//        //get newSize with height and width
//        Dimension newSize = driver.manage().window().getSize();
//        System.out.println("page size is changed to : width -" + newSize.width + " height -" + newSize.height);
//
//        //getPosition with x and y coordinates
//        Point position = driver.manage().window().getPosition();
//        System.out.println("page position is : X- coordinate :" + position.x + " Y- coordinate :" + position.y);
//
//        //setPosition
//        Point setPosition = new Point(150, 100);
//        driver.manage().window().setPosition(setPosition);
//
//        //get newPosition with x and y coordinate
//        Point newPosition = driver.manage().window().getPosition();
//        System.out.println("page position is : X- coordinate :" + newPosition.x + " Y- coordinate :" + newPosition.y);
//
//        driver.manage().window().maximize();
//        //getWindowHandle
//        String firstTabID = driver.getWindowHandle();
//        System.out.println("window id is :" + firstTabID);
//
//
//        driver.findElement(By.id("tabButton")).click();
//        System.out.println("window's id is :");
//        //getWindowHandle
//        Set<String> firstTabIDs = driver.getWindowHandles();
//        for (String id : firstTabIDs) {
//            System.out.println(id);
//            driver.switchTo().window(id);
//            System.out.println(id + " --- > window url is  :" + driver.getCurrentUrl());
//        }
//
//
//    }
//
//    @Test
//    public void switchFrameToElement() {
//        WebDriverManager.chromedriver().setup();
//
//        //to navigate to the website or web application we will use get()
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/frames");
//
//        //driver.switchTo().frame("frame1");
//        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
//
//    }
}
