package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {
    private WebDriver driver;
    private By inputField= By.tagName("input");
    private By result=By.id("range");

    public HorizontalSlider(WebDriver driver){
        this.driver=driver;
    }
    public void clickSlider(Keys text){
        for(int i=0; i<8;i++){
            driver.findElement(inputField).sendKeys(text);
        }
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }
}
