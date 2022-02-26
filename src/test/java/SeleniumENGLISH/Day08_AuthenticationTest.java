package SeleniumENGLISH;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Day08_AuthenticationTest extends TestBase {

    @Test
    public void basicAuthentication(){

        // Authentication is done for verification

        // *** (SYNTAX)=>>    https://username:password@URL   ****

       // https://the-internet.herokuapp.com/basic_auth

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); // IT WILL LOG IN

        // Verifying the login is successfull
    String congratMessage=driver.findElement(By.xpath("//p")).getText();
    Assert.assertTrue(congratMessage.contains("Congratulations!"));
    //  Assert.assertEquals(congratMessage,"Congratulations! You must have the proper credentials.");



    }
}
