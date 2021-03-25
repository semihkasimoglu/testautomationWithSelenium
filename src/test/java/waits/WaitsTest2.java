package waits;

import base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class WaitsTest2 extends BaseTest {

    @Test
    public void testLoadingTest(){
        var loadingPage=homePage.clickDynamicLoading().clickExample2();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadingText(),"Hello World!");
    }
}
