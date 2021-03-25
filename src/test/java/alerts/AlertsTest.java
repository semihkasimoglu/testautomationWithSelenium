package alerts;

import base.BaseTest;
import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTest extends BaseTest {
    @Test
    public void testAlerts(){
        var alertsPage=homePage.clickAlertsPage();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResultText(),"You successfully clicked an alert");
    }
    @Test
    public void testGetTextFromAlert(){
        var alertsPage=homePage.clickAlertsPage();
        alertsPage.triggerConfirm();
        assertEquals(alertsPage.alert_getText(),"I am a JS Confirm","Confirm message is incorrect");
        alertsPage.alert_clickToDismiss();
    }
    @Test
    public void testResultFromPrompt(){
        var alertsPage=homePage.clickAlertsPage();
        alertsPage.triggerPrompt();
        String text="TAU rocks";
        alertsPage.alert_sendKeys(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResultText(),"You entered: TAU rocks");


    }
}
