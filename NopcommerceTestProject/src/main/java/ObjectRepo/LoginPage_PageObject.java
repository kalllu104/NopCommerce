package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PageObject {

    WebDriver driver;
    public LoginPage_PageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "Email")
    WebElement username;

    @FindBy(id = "Password")
    WebElement password;


    public void Enter_Username(String userName){
        username.sendKeys(userName);
    }

    public void Enter_Password(String Password){
        password.sendKeys(Password);
    }




}
