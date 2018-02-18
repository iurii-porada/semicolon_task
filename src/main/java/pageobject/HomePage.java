package pageobject;
import org.openqa.selenium.By;

public class HomePage  extends AbstractTestClass{

    public static final By ADMIN_PAGE_VALIDATOR = By.cssSelector("[href ='/admin/adminpage.html']");

    //Method to verify if the user is logged in as an admin or a regular user
    public String verifyAdminPage() {
        return driver.findElement(ADMIN_PAGE_VALIDATOR).getText();
    }
}
