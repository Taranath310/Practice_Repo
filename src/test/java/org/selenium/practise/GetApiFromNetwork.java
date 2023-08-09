package org.selenium.practise;

import com.google.gson.Gson;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v114.network.Network;
import org.openqa.selenium.devtools.v114.network.model.Headers;
import org.openqa.selenium.devtools.v114.network.model.Request;
import org.openqa.selenium.devtools.v114.network.model.Response;
import org.openqa.selenium.json.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Optional;

public class GetApiFromNetwork {
    private static final String LOGIN_EMAIL = "pavan.n@fireflink.com";
    private static final String LOGIN_PASSWORD = "Password@123";

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

        devTools.addListener(Network.requestWillBeSent(), requestWillBeSent -> {
            Request request = requestWillBeSent.getRequest();
            String url = request.getUrl();
            Headers headers = request.getHeaders();
            String method = request.getMethod();
            String payload1 = String.valueOf(request.getPostData());

            Gson gson = new Gson();
            Type mapType1 = new TypeToken<Map<String, Object>>() {}.getType();

            if (url.contains(".fireflink.com")) {
                System.out.println("Sign In Request URL: " + url);
                System.out.println("Request Headers: " + headers);
                System.out.println("Method: " + method);
                System.out.println("Payload: " + payload1);


                Map<String, Object> payLoadData = gson.fromJson(payload1, mapType1);
                System.out.println("Payload data: " + payLoadData);

                String emailId = getValueFromPayload(payLoadData, "emailId");
                System.out.println("Email ID from Payload: " + emailId);
            }
        });

        Gson gson = new Gson();
        Type mapType = new TypeToken<Map<String, Object>>() {}.getType();

        devTools.addListener(Network.responseReceived(), responseReceived -> {
            Response response = responseReceived.getResponse();
            String url = response.getUrl();
            int statusCode = response.getStatus();
            String body = devTools.send(Network.getResponseBody(responseReceived.getRequestId())).getBody();

            if (url.contains(".fireflink.com")) {
                System.out.println("Sign In Response URL: " + url);
                System.out.println("Status Code: " + statusCode);
                System.out.println("Response Body: " + body);

                Map<String, Object> responseData = gson.fromJson(body, mapType);
                String value = getValueFromResponseData(responseData, "responseCode");
                System.out.println("Value from responseData : " + value);

            }

        });

        driver.get("https://crowd.fireflink.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(LOGIN_EMAIL);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(LOGIN_PASSWORD);
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        Thread.sleep(2000);

        driver.quit();
    }

    private static String getValueFromResponseData(Map<String, Object> responseData, String key) {
        if (responseData.containsKey(key)) {
            Object value = responseData.get(key);
            if (value != null) {
                return value.toString();
            }
        }
        return null;
    }

    private static String getValueFromPayload(Map<String, Object> payload, String key) {
        if (payload.containsKey(key)) {
            Object value = payload.get(key);
            if (value != null) {
                return value.toString();
            }
        }
        return null;
    }
}
