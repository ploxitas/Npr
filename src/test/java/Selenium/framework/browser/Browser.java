package Selenium.framework.browser;

import org.openqa.selenium.WebDriver;

public class Browser {
    private WebDriver driver;
    public static Browser BROWSER = new Browser();
    private Browser() {
        driver = BrowserFactory.getDriver("chrome");
    }

    public void open(String url) {
        driver.get(url);
    }

    public void close() {
        driver.quit();
    }

    public void window() {
        driver.manage().window().maximize();
    }
    public WebDriver getDriver(){
        return driver;
    }
}
