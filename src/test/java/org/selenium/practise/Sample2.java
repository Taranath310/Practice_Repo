package org.selenium.practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Sample2 {
    List<String> title;

    @BeforeClass
    public void setUp() {
        title = new ArrayList<>();
    }
//adding comments
    @Test()
    public void brunnerTest1() {
        title.add("http://106.51.74.69:8000/login");
    }


    @Test()
    public void crunnerTest2() {
        title.add("https://www.youtube.com/");
    }

    @Test()
    public void arunnerTest3() {
        title.add("https://acrossgeo.com/login");
    }

    @AfterClass()
    public void arunnerTest4() {
        for (String s : title) {
            System.out.println(s);
        }
    }


}
