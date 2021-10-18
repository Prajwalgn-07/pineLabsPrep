package Pages;

import org.codehaus.groovy.ast.stmt.WhileStatement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class HomePage{
    WebDriver driver;
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    @FindBy(xpath = "//a[@class=\"lvl-0 sign-in btn btn-md btn-white-outline\"]")
    WebElement LoginButton;
    @FindBy(xpath = "/html/body/header/div/nav/div[1]/span")
    WebElement Features;
    @FindBy(xpath = "//*[@class=\"lvl-0 dropdown open\"]//div//a")
    List<WebElement>FeaturesDropDown;

    public String getLoginWindow(){
        LoginButton.click();
        String mainWindow=driver.getWindowHandle();
        Set<String>windows=driver.getWindowHandles();
        for(String window : windows){
            if(!mainWindow.equalsIgnoreCase(window)) {
                driver.switchTo().window(window);
            }
        }
        return mainWindow;
    }
    public void selectFeature(String Feature){
        Features.click();
        for(WebElement webElement:FeaturesDropDown){
            if(webElement.getText().equals(Feature)){
                webElement.click();
                break;
            }
        }
    }
}
