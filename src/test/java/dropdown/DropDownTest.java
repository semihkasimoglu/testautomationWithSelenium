package dropdown;

import base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {

    @Test
    public void testSelectedOption(){
        var dropdownPage=homePage.clickDropdown();
        String option="Option 1";
        dropdownPage.selectFromDropDown(option);
        var selectedOptions=dropdownPage.getSelectedOption();
        assertEquals(selectedOptions.size(),1,"incorrect");
        assertTrue(selectedOptions.contains(option));
    }
}
