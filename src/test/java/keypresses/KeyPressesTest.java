package keypresses;

import base.BaseTest;
import org.openqa.selenium.Keys;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class KeyPressesTest extends BaseTest {

    @Test
    public void testBackSpace(){
       var keyPage= homePage.clickKeyPresses();
       keyPage.enterText("A"+ Keys.BACK_SPACE);
        assertEquals(keyPage.returnResult(),"You entered: BACK_SPACE");

    }
}
