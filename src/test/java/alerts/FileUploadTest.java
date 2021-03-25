package alerts;

import base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload(){
        var fileUploadPage=homePage.clickFileUpload();
        fileUploadPage.uploadFile("C:\\Users\\SKASIMOG\\IdeaProjects\\testautomation_java\\resources\\aa.pdf");
        assertEquals(fileUploadPage.getUploadedFiles(),"aa.pdf");
    }
}
