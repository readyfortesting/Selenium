package SeleniumENGLISH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.sql.Driver;

public class Day06_Alerts extends TestBase {

    @Test
    public void acceptAlert() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        // Locating the first button and click on it
        WebElement button1=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        button1.click();
        // you can do this one single line but we prefer using in 2 lines because it shows us what to click on.

        // We cannot inspect alert elements,so we must use switch to() function to handle alerts.
        String actualAlertText=driver.switchTo().alert().getText();
        Thread.sleep(1000);
        Assert.assertEquals(actualAlertText,"I am a JS Alert","Text does not match");

        // Click OK
        //Again,we cannot inspect OK button on the Alert so we must switch to Alert and Accept
        driver.switchTo().alert().accept();

        // VERIFY "You successfully clicked an alert"
        String actualResult= driver.findElement(By.id("result")).getText();
        //this is LAST STEP to verify
        Assert.assertEquals(actualResult,"You successfully clicked an alert");



    }
    @Test
    public void dismissAlert() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        // Click on the second alert
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        // verify text "I am a JS Confirm",
        String actualAlertText= driver.switchTo().alert().getText();
        Assert.assertEquals(actualAlertText,"I am a JS Confirm");

        //click cancel (we cannot click because we cannot locate it)
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();

        // And verify "You clicked: Cancel"

        String actualResult=driver.findElement(By.xpath("//p[@id='result']")).getText();
        Thread.sleep(2000);
        Assert.assertEquals(actualResult,"You clicked: Cancel");



    }
    @Test
    public void sendKeysAlert(){
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        //Click on the third alert
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        //Verify text "I am a JS prompt",
        String actualText=driver.switchTo().alert().getText();
        Assert.assertEquals(actualText,"I am a JS prompt");

        //Type "Hello World",and then click OK *** accept(); ****
        driver.switchTo().alert().sendKeys("Hello World");
        //click OK
        driver.switchTo().alert().accept();

        //Verify "You entered; Hello Word"
        String actualResult=driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(actualResult,"You entered: Hello World");


    }
}
