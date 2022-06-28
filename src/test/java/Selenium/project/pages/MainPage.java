package Selenium.project.pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    public void open(){
        getDriver().get("https://market.yandex.by/");
    }
}
