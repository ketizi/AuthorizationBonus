package LandingObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static DataObject.LogInData.*;

public class HomePage {
    public static WebElement AuthorizationBonus;
    WebDriver driver;

    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    By authorizationButton = By.xpath("/html/body/app-root/div[2]/div[1]/div/div[3]/div/front-auth[1]/div/a/div");
    By userNameInput = By.id("username");
    By passwordInput = By.id("password");
    By authorizationButton2 = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/user-authorization/div/div[2]/common-authorization/div/div/div/mat-horizontal-stepper/div[2]/div[1]/auth-credentials/div/form/div[2]/design-system-button/button/div");
    By mobileNumberInput = By.id("mobileNumberOrId");
    By authorizationButton3 = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/user-authorization/div/div[2]/common-authorization/div/div/div/mat-horizontal-stepper/div[2]/div[2]/auth-extended/div/form/div[2]/design-system-button/button/div");
    By startPlayingButton = By.xpath("/html/body/app-root/div[2]/div[1]/div/div[4]/front-slot-loader/div[1]/div");

    public void authorizationButt(){
        driver.findElement(authorizationButton).click();
    }
    public void userName (){
        driver.findElement(userNameInput).sendKeys(useNameInput1);
    }
    public void password () {
        driver.findElement(passwordInput).sendKeys(passwordInput1);
    }
    public void authorizationButt2 (){
        driver.findElement(authorizationButton2).click();
    }
    public void mobileNumber () throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement catchElement = wait.until(ExpectedConditions.visibilityOfElementLocated(mobileNumberInput));
        driver.findElement(mobileNumberInput).sendKeys(mobileInput1);
        Thread.sleep(1000);
    }
    public void setAuthorizationButton3 (){

        driver.findElement(authorizationButton3).click();
    }
    public void startPlayingButt() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement catchElement = wait.until(ExpectedConditions.(startPlayingButton));
        WebElement canvasElement = driver.findElement(By.xpath("/html/body/app-root/div[2]/div[1]/div/div[4]/front-slot-loader/div/canvas"));

        int xCoordinate = 100;
        int yCoordinate = 200;

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver; // Cast WebDriver to JavascriptExecutor


        jsExecutor.executeScript(
                "var canvas = arguments[0];" +
                        "var x = arguments[1];" +
                        "var y = arguments[2];" +
                        "var event = new MouseEvent('click', {" +
                        "    bubbles: true," +
                        "    clientX: x" +
                        "    clientY: y" +
                        "});" +
                        "canvas.dispatchEvent(event);",
                canvasElement, xCoordinate, yCoordinate
        );

        driver.quit();
         jsExecutor.executeScript("window.scrollBy(0,400)","");
        Thread.sleep(10000);
    }

}






