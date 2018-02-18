import pageobject.AbstractTestClass;
import pageobject.HomePage;
import pageobject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static pageobject.LoginPage.*;

public class SecondTest extends AbstractTestClass {

    @Test
    public void test_regular_user_login() {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        loginPage.doLogin(user, user_pass);
        Assert.assertEquals(homePage.verifyAdminPage(), non_adm_page,
                "User is not on regular user page");
    }
}
