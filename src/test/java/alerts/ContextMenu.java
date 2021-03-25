package alerts;

import base.BaseTest;
import org.openqa.selenium.Keys;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ContextMenu extends BaseTest {
    @Test

    public void testModelContext() throws InterruptedException {
        var contextMenuPage=homePage.clickContextMenu();
        contextMenuPage.clickRightContext(Keys.chord(Keys.ALT,Keys.TAB));
        Thread.sleep(4000);
        assertEquals(contextMenuPage.getAlertMessage(),"You selected a context menu");
    }
}
