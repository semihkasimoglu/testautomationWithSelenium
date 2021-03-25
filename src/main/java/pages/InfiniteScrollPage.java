package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By textBlocks= By.className("jscroll-added");
    public InfiniteScrollPage(WebDriver driver){
        this.driver=driver;
    }

    /**
     *Scrolls until paragraph with index specified is in view
     * @param index 1-based
     */
    public void scrollToTextBlock(int index){
     String script="window.scrollTo(0,document.body.scrollHeight)";
     var jsExecuter=(JavascriptExecutor)driver;
     while(getNumberOfParagraphPresent()<index){
         jsExecuter.executeScript(script);
     }
    }
    private int getNumberOfParagraphPresent(){
        return driver.findElements(textBlocks).size();
    }
}
