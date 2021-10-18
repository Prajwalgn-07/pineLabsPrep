import Utils.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    PropertyReader propertyReader;
    public  WebDriver driver;

    public BaseTest() throws IOException {
        propertyReader=new PropertyReader("/Users/prajwal/Desktop/testvagrant /assignment projects/PineLabsPreparation/src/main/resources/webPage.properties");
    }

    public void initializeBrowser(){
        String browser=System.getProperty("Browser");
        if(browser==null){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if(browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        driver.get(propertyReader.getProperty("webPageLink"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
}
