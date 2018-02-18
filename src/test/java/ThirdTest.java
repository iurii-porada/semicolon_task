import pageobject.AbstractTestClass;
import pageobject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static pageobject.LoginPage.*;

public class ThirdTest extends AbstractTestClass {

    @Test
    public void test_wrong_login() {
        LoginPage loginPage = new LoginPage();
        loginPage.doLogin(wrong_user, wrong_pass);
        Assert.assertTrue(loginPage.verifyLoginPage(), "User is not on login page");
    }
}
