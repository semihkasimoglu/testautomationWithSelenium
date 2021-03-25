package navigation;

import base.BaseTest;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTest {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().goForward();
        getWindowManager().refreshPage();
        getWindowManager().goTo("http://www.google.com");
    }
    @Test
    public void testSwitchToTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");

    }
    @Test
    public void testSwitchDynamicLoading(){
        homePage.clickDynamicLoading().rightClick();
        getWindowManager().switchToTab("The Internet");
    }
}
