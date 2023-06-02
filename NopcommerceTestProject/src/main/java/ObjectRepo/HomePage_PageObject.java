package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class HomePage_PageObject extends LoginPage_PageObject {

    WebDriver driver;
    public HomePage_PageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "ico-register")
    WebElement RegistrationLink;

    @FindBy(linkText = "Log in")
    WebElement LoginLink;

    public void Click_RegistrationLink(){
        RegistrationLink.click();
    }



}
