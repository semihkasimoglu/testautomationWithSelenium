package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {
    private WebDriver driver;
    private By clickButton= By.linkText("Click Here");
   // private By clickB=By.xpath("a[@href='/windows/new']");

    public MultipleWindowsPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickHere(){
        driver.findElement(clickButton).click();
    }
}
