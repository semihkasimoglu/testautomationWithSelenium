package horizontalSlider;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSilderTest extends BaseTest {
    @Test
    public void changeRange(){
        var horizontalSliderPage=homePage.clickHorizontalSlider();
        horizontalSliderPage.clickSlider(Keys.ARROW_RIGHT);
        Assert.assertEquals(horizontalSliderPage.getResult(),"4");


    }
}
