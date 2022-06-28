package Selenium.project.tests;

import Selenium.framework.browser.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private Browser browser= Browser.BROWSER;
    @BeforeMethod
    public void setUp(){
        browser.window();

    }
    @AfterMethod
    public void tearDown(){
        if (browser)
    }
}
