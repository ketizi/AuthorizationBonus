import LandingObject.HomePage;
import Utils.ChromeRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestLanding  extends ChromeRunner {

    @Test
    public void LandingAuthorization() throws InterruptedException {
        HomePage page = new HomePage(driver);
        page.authorizationButt();
        page.userName();
        page.password();
        page.authorizationButt2();
        page.mobileNumber();
        page.setAuthorizationButton3();
        page.startPlayingButt();

    }

}
