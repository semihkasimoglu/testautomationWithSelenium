package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalPage {
    private WebDriver driver;
    private By footer= By.cssSelector(".modal-footer p");
    private By modal=By.id("modal");

    public ModalPage(WebDriver driver){
        this.driver=driver;
    }
   public String getFooterText(){
        return driver.findElement(footer).getText();
   }

}
