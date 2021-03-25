package alerts;

import base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ModalTest extends BaseTest {

    @Test
    public void testModalTitle(){
        var modalPage=homePage.clickModal();
//        assertEquals(modalPage.getFooterText(),"Close");
    }
}
