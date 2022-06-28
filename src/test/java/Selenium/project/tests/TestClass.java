package Selenium.project.tests;

import Selenium.project.pages.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestClass {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void test() {
        MainPage mainPage = new MainPage();
        mainPage.open();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://market.yandex.by/");
        WebElement element = driver.findElement(By.xpath("//span[text()='Войти']"));
        element.click();
        WebElement logIn = driver.findElement(By.xpath("//input[@name='login']"));
        logIn.sendKeys("ploxitas");
        WebElement in = driver.findElement(By.xpath("//button [@id='passp:sign-in']"));
        in.click();
        WebElement passwd = driver.findElement(By.xpath("//input[@name='passwd']"));
        passwd.sendKeys("2687553Shag");
        WebElement in2 = driver.findElement(By.xpath("//button[@id='passp:sign-in']"));
        in2.click();
        WebElement in3 = driver.findElement(By.xpath("//button[@data-t='button:action']"));
        in3.click();
        WebElement catalog = driver.findElement(By.xpath("//span[text()='Каталог']"));
        catalog.click();
        List<WebElement> elements = driver.findElements(By.xpath("//li[@data-zone-name='category-link']"));
        Assert.assertEquals(elements.size(), 26, "");
        double random = Math.random();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
