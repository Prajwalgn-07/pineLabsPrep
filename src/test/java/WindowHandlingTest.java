import Pages.HomePage;
import Pages.LoginPage;
import Utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class WindowHandlingTest extends BaseTest{
    PropertyReader propertyReader;

    public WindowHandlingTest() throws IOException {
        super();
        propertyReader=new PropertyReader("/Users/prajwal/Desktop/testvagrant /assignment projects/PineLabsPreparation/src/main/resources/loginDetails.properties");
    }

    @BeforeTest
    public void beforeTest(){
        initializeBrowser();
    }
    @Test
    public void windowsHandling(){
        HomePage homePage=new HomePage(driver);
        String mainWindow=homePage.getLoginWindow();
        LoginPage loginPage=new LoginPage(driver);
        loginPage.fillLoginDetails(this.propertyReader.getProperty("Email"),this.propertyReader.getProperty("Password"));
        loginPage.setCheckBox();
    }
    @AfterTest
    public void TearDown(){
        driver.quit();
    }
}
