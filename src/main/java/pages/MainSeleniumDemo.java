package pages;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class MainSeleniumDemo {
    public static void main(String [] args) throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        DesiredCapabilities capability=DesiredCapabilities.chrome();
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.ANY);
        WebDriver driver=new RemoteWebDriver(new URL("http://62.166.240.15:5565/wd/hub"),capability);
        try{
            driver.get("http://demo.opencart.com/");
            driver.manage().window().maximize();
            System.out.println(driver.getTitle());
        }catch (Exception e){
            System.out.println("Hello");
        }
    }
}
