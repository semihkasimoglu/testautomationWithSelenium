package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {
    private WebDriver driver;
//    private String linkXpath_format="//a[contains(text(),%s)";
    private By linkXpath_example1=By.xpath("//a[@href='/dynamic_loading/1']");
    private By linkXpath_example2=By.xpath("//a[@href='/dynamic_loading/2']");
  //  private By link_Example1=By.xpath(String.format(linkXpath_format,"Example 1"));

    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(linkXpath_example1).click();
        return new DynamicLoadingExample1Page(driver);
    }
    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(linkXpath_example2).click();
        return new DynamicLoadingExample2Page(driver);
    }
    public void rightClick(){
        Actions actions=new Actions(driver);
        actions.keyDown(Keys.LEFT_CONTROL)
                .click(driver.findElement(linkXpath_example2))
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();
       // actions.contextClick(driver.findElement(linkXpath_example2)).perform();
    }


}

