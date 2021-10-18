import Pages.HomePage;
import Utils.PropertyReader;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class FeatureSelectionTest extends BaseTest{
    PropertyReader propertyReader;

    public FeatureSelectionTest() throws IOException {
        super();
        propertyReader=new PropertyReader("/Users/prajwal/Desktop/testvagrant /assignment projects/PineLabsPreparation/src/main/resources/webPage.properties");
    }
    @BeforeTest
    public void beforeTest(){
        initializeBrowser();
    }
    @Test
    public void selectFeature(){
        HomePage homePage=new HomePage(driver);
        homePage.selectFeature(propertyReader.getProperty("feature"));
        Assert.assertEquals(driver.getTitle(),"Php Hotels module standard and API based features - PHPTRAVELS");
    }
    @AfterTest
    public void TearDown(){
        driver.quit();
    }
}
