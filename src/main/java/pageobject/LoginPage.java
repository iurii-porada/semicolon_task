package pageobject;

import org.openqa.selenium.By;


public class LoginPage extends AbstractTestClass {


    public static final String adm_user = "admin";
    public static final String adm_pass = "adminPass";
    public static final String user = "user1";
    public static final String user_pass = "user1Pass";
    public static final String wrong_user = "wronguser";
    public static final String wrong_pass = "wrongpass";
    public static final String adm_page = "Admin Page";
    public static final String non_adm_page = "Restricted Admin Page";

    public static final By USER_NAME_INPUT = By.cssSelector("[type = 'text']");
    public static final By PASSWORD_INPUT = By.cssSelector("[type = 'password']");
    public static final By SUBMIT_BUTTON = By.cssSelector("[type = 'submit']");

    //Simple login method
    public void doLogin(String username, String password) {
        driver.findElement(USER_NAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(SUBMIT_BUTTON).click();
    }

    //Method to verify if the user is on Login Page
    public Boolean verifyLoginPage() {
        return driver.findElement(SUBMIT_BUTTON).isDisplayed();
    }
}
