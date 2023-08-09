package org.selenium.practise;

import org.testng.annotations.DataProvider;

public class DataProviderPractise {
    @DataProvider(name = "setDataFromDiffrentClass",parallel = true)
    public Object[][] dataProviderSet() {
        Object[][] obj = new Object[2][1];
        obj[0][0] = "https://www.youtube.com/";
        obj[1][0] = "https://www.amazon.in/";
        return obj;
    }
}
