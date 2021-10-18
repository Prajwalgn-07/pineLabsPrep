package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public LoginPage(WebDriver driver){
    PageFactory.initElements(driver,this);
}
    @FindBy(css = "#inputEmail")
    WebElement EmailAddress;
    @FindBy(css = "#inputPassword")
    WebElement Password;
    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    WebElement checkBox;
    public void fillLoginDetails(String userName,String password){
        EmailAddress.sendKeys(userName);
        Password.sendKeys(password);
    }
    public void setCheckBox(){
        checkBox.click();
    }
}
