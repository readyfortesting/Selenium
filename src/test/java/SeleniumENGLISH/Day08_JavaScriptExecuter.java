package SeleniumENGLISH;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Day08_JavaScriptExecuter extends TestBase {

    //it is coming from SELENIUM, used for better interaction.
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
}
