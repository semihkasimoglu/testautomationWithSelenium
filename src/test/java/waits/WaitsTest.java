package waits;

import base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class WaitsTest extends BaseTest {
    @Test

    public void testHiddenLoading(){
        var loadingPage=homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadadedText(),"Hello World!");
    }
}
