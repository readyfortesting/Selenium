package SeleniumENGLISH;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Day08_JavaScriptExecuter extends TestBase {

    //it is coming from SELENIUM, used for better interaction. **** IT IS USED COMMON***
    // WE CAN SCROLL CERTAIN SPECIFIC ELEMENT WITH JAVA SCRIPT EXECUTER!!!
    @Test
    public void scrollIntoView() throws InterruptedException {


        //  STEP 1 => Creating javascript executer object and casting driver  (driver)
        JavascriptExecutor je= (JavascriptExecutor)driver;


        driver.get("https://www.carettahotel.com");
        Thread.sleep(3000);


       WebElement ourRooms=driver.findElement(By.xpath("//*[.='Our Rooms']"));
      //  STEP 2 => Use jAVASCRIPTexecute method.
        je.executeScript("arguments[0].scrollIntoView(true);",ourRooms);



    }
    @Test
    public void clickWithJavaScripts(){
        driver.get("https://a.testaddressbook.com/sign_in");

        //Click onsign in button using Java Script Executer

      WebElement  signInButton=driver.findElement(By.xpath("//input[@type='submit']"));
      //  signInButton.click(); Normally, click() method works with selenium.We use this when it is good.
        //Some elements can be challenging to click
        //in that case, we have javascriptexecuter click as an alternative.
        //THIS PERFORMS BETTER ON SOME APPLICATIONS.

        //1. Create Javascript executer object
        JavascriptExecutor je=(JavascriptExecutor) driver;

        //2. Use the appropriate method
        je.executeScript("arguments[0].click();",signInButton);

        //Assert that the click happened using the message.
        Assert.assertTrue(driver.getPageSource().contains("Bad email or password."));



    }
    @Test
    public void scrollDownWithJavaScript() throws InterruptedException {
        driver.get("https://www.carettahotel.com/");

        // Scroll down to the page using javascript executer.
        JavascriptExecutor je=(JavascriptExecutor) driver;
        Thread.sleep(3000);
        je.executeScript("window.scrollTo(0,document.body.scrollHeight)");


    }
}
