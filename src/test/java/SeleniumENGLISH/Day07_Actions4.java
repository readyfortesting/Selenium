package SeleniumENGLISH;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Day07_Actions4 extends TestBase {

    @Test
    public void scrollUpDown() throws InterruptedException {
        driver.get("https://www.amazon.com");

        //1. Create Actions class
        Actions actions=new Actions(driver);

        //Use proper actions method
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform(); //scrolling page down


        // ARROW_DOWN moving page a little bit.
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();

        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_DOWN).perform(); //scrolling page down a little


        // PAGE_UP and ARROW_UP is used to move the page up.But arrow_up is a little.
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_UP).perform();

    }

}
