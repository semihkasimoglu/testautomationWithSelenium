package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {
    private WebDriver driver;
    private By context= By.id("hot-spot");


    public ContextMenu(WebDriver driver){
        this.driver=driver;
    }
    public void clickRightContext(String text){
        Actions actions=new Actions(driver);
        WebElement element = driver.findElement(context);
        actions.contextClick(element).perform();

    }
    public String getAlertMessage(){
        return driver.switchTo().alert().getText();
    }
}
