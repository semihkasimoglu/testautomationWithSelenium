package login;

import base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage=homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage=loginPage.clickLoginButton();
        secureAreaPage.getAlertText();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert text is incorrect");
    }

}
