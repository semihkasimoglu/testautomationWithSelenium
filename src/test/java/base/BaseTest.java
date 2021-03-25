package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BaseTest {
    private WebDriver driver;
//    private EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
//        driver= new EventFiringWebDriver(new ChromeDriver());
        driver= new ChromeDriver();
//        driver.register(new EventReporter());
     goHome();
        homePage=new HomePage(driver);
        //There are 3 ways to set window
       //1. driver.manage().window().maximize();
        //2. driver.manage().window().fullscreen();
       //3. driver.manage().window().setSize(new Dimension(375,812));

        //find many elements
//        List<WebElement> lists=driver.findElements(By.tagName("a"));
//        System.out.println(lists.size());

        //find single Element
//        WebElement inputLinks= driver.findElement(By.linkText("Semih"));
//        inputLinks .click();

        //Exercise
//        WebElement shifting=driver.findElement(By.linkText("Shifting Content"));
//        shifting.click();
//        List<WebElement> examples=driver.findElements(By.tagName("a"));
//        examples.get(1).click();
//
//        List<WebElement> menuItems=driver.findElements(By.tagName("li"));
//        System.out.println(menuItems.size());


//        System.out.println(driver.getTitle());
        //driver.quit();
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus()){
            var camera=(TakesScreenshot)driver;
            File screenshot=camera.getScreenshotAs(OutputType.FILE);

            try{
                Files.move(screenshot,new File("resources/screenshots/"+result.getName()+".png"));
            }catch (IOException e){
                e.printStackTrace();
            }
        }


//        System.out.println("Screenshot is taken: "+screenshot.getAbsolutePath());
    }
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
//    public static void main(String[] args){
//        BaseTest base=new BaseTest();
//        base.setUp();
//
//    }
}
