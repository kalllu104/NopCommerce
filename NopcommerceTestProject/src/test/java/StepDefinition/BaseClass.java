package StepDefinition;

import ObjectRepo.HomePage_PageObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {

    public static WebDriver driver;
    public static HomePage_PageObject homepageObject;
    public static void driverinit(String browser, String URL){


        switch (browser) {
            case "Chrome":
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;

                case "Edge":
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                break;

            case "Firefox":
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;

            case "Safari":
                driver = new SafariDriver();
                driver.manage().window().maximize();
                break;
        }

        driver.get(URL);

       homepageObject= new HomePage_PageObject(driver);

    }

    public void closeBrowser(){
        driver.close();
    }
}
