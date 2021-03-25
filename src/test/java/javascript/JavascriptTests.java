package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

public class JavascriptTests extends BaseTest {
    @Test
    public void scrollToTable(){
        homePage.clickLargeDeepDOM().scrollToTable();
    }
    @Test
    public void scrollToFifthParag(){
        homePage.clickInfiniteScroll().scrollToTextBlock(5);
    }
}
