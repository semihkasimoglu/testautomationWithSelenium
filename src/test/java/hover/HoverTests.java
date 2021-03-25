package hover;

import base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class HoverTests extends BaseTest {

    @Test
    public void testHoverUser1(){
        var hover=homePage.clickHovers();
        var caption=hover.hoverOverFigure(1);
        assertTrue(caption.isDisplayed(),"caption is not displayed");
        assertEquals(caption.getTitle(),"name: user1");
        assertEquals(caption.getLinkText(),"View profile","Caption link text is not correct");
        assertTrue(caption.getLink().endsWith("/users/1"));
    }
}
