package SeleniumENGLISH;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Day07_Actions3 extends TestBase {

    /* > Create a class : Actions3
    > Create test method : keysUpDown()
    > Go to google/amazon
    > Send iPhone X prices => convert small letter vice versa
    > Highlight the search box by double clicking
     */

    @Test
    public void keysUpDown(){
        driver.get("https://www.google.com");
        WebElement searchBox= driver.findElement(By.name("q"));

        //1. Create actions object for keyboard actions
        Actions actions=new Actions(driver);

        //2. Use the proper object for keyboard actions
        actions
                .keyDown(searchBox, Keys.SHIFT)// keyDown: pressing the Shift on searchbox
                .sendKeys("iPhone X prices") // typing in the search box
                .keyUp(searchBox,Keys.SHIFT) // unpressing
                .perform();


    }
}
