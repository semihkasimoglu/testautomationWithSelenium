package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DynamicLoadingExample2Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator=By.id("loading");
    private By loadingText=By.id("finish");
    public DynamicLoadingExample2Page(WebDriver driver){
        this.driver=driver;
    }
    public void clickStart(){
        driver.findElement(startButton).click();
        WebDriverWait wait =new WebDriverWait(driver,7);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish")));
//        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
//                .withTimeout(30, TimeUnit.SECONDS)
//                .pollingEvery(200, TimeUnit.MILLISECONDS)
//                .ignoring(NoSuchElementException.class);
//        fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish")));
    }
    public String getLoadingText(){
        return driver.findElement(loadingText).getText();
    }

}
