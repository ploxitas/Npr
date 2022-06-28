package Selenium.project.pages;

import Selenium.framework.browser.Browser;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    private WebDriver driver;

    public BasePage() {
        this.driver = Browser.BROWSER.getDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}


