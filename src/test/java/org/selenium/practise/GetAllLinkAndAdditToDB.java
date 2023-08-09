package org.selenium.practise;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.bson.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetAllLinkAndAdditToDB {
    MongoClient mongoClient;
    MongoDatabase db;
    MongoCollection<Document> collection;

    Map<Object, Object> srcAndAltText = new HashMap<>();

    @BeforeMethod
    public void connectToBD() {
        mongoClient = new MongoClient("localhost", 27017);
        db = mongoClient.getDatabase("Images");
        collection = db.getCollection("images_src_alttext");

    }

    @Test()
    public void runnerTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://acrossgeo.com/");
        List<WebElement> listOfAllLink = driver.findElements(By.xpath("//img"));
        for (WebElement ele : listOfAllLink) {
            Document doc = new Document();
            doc.append("src", ele.getAttribute("src"));
            doc.append("tagName", ele.getAttribute("alt"));
            collection.insertOne(doc);
        }

    }

    @AfterMethod
    public void getDocumentsFromDB() {
        //  collection.
    }
}
