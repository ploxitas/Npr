package Selenium.framework.cookies;
import Selenium.framework.browser.Browser;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
public class ManagerCookie {
    private WebDriver driver= Browser.BROWSER.getDriver();
    public void addCookie (String name, String value){
        driver.manage(addCookie(new Cookie(name,value));
        
    }

    private Object addCookie(Cookie cookie) {
    }

    public  
}
