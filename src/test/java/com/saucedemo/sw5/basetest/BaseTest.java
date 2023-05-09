package com.saucedemo.sw5.basetest;

import com.saucedemo.sw5.propertyreader.PropertyReader;
import com.saucedemo.sw5.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterMethod()
    public void tearDown() {
        closeBrowser();
    }
}

