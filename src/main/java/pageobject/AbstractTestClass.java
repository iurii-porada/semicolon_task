package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class AbstractTestClass {
    public static WebDriver driver;

    @BeforeTest
    public void startTest() {
        String baseURL = "http://localhost:8080";
        System.setProperty("webdriver.chrome.driver", "F:\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }


}
