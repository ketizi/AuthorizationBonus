package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ChromeRunner {

    public static WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void openBrowser(){
        driver.manage().window().maximize();
        driver.get("https://testpromotion.betlive.com/public/ka/AuthorizationBonus/");

    }
    @AfterTest
    public void closeBrowser(){
        if (driver !=null){
            driver.quit();
        }
    }
}
