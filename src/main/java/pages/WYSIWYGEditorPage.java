package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String iframeId="mce_0_ifr";
    private By textArea= By.id("tinymce");
    private By decreaseIndentButton=By.xpath("//div[@title='indentation']/button[1]");

    public WYSIWYGEditorPage(WebDriver driver){
        this.driver=driver;
    }
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();

    }
    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public void clickDecreaseIndent(){
        driver.findElement(decreaseIndentButton).click();
    }
public String getTextFromEditor(){
        switchToEditArea();
        String text=driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
}
    public void switchToEditArea(){
        driver.switchTo().frame(iframeId);
    }
    public void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
