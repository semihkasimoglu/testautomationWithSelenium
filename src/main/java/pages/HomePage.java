package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
//    private By formAuthenticationLink= By.linkText("Form Authentication");


    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public ModalPage clickModal(){
        clickLink("Entry Ad");
        return new ModalPage(driver);
    }
    public ContextMenu clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenu(driver);
    }
    public HorizontalSlider clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSlider(driver);
    }
    public AlertsPage clickAlertsPage(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public WYSIWYGEditorPage clickWYSIWYGEditor(){
        clickLink("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeDeepDOMPage clickLargeDeepDOM(){
        clickLink("Large & Deep DOM");
        return new   LargeDeepDOMPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
