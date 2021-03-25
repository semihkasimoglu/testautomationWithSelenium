package frames;

import base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class FrameTests extends BaseTest {
    @Test
    public void testFrame(){
        var framePage=homePage.clickWYSIWYGEditor();
      framePage.clearTextArea();
      String text1="hello ";
      String text2="world";
      framePage.setTextArea(text1);
      framePage.clickDecreaseIndent();
      framePage.setTextArea(text2);
        assertEquals(framePage.getTextFromEditor(),text1+text2);
    }
}
