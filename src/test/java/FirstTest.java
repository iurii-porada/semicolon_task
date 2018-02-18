import pageobject.AbstractTestClass;
import pageobject.HomePage;
import pageobject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static pageobject.LoginPage.*;

public class FirstTest extends AbstractTestClass {

    @Test
    public void test_admin_login() {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        loginPage.doLogin(adm_user, adm_pass);
        Assert.assertEquals(homePage.verifyAdminPage(), adm_page, "User is not on admin page");
    }
}
