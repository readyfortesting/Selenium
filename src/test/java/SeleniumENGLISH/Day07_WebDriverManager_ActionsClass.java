package SeleniumENGLISH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Day07_WebDriverManager_ActionsClass  extends TestBase {

    /* > Create a class : Actions1
      >  Create a test method: contextClickMethod() and test the following scenario:
      >  Given user is on the https://the-internet.herokuapp.com/context_menu
      >  When use Right clicks on the box
      >  Then verify the alert message is "You selected a context menu"
      >  Then accept the alert
     */

    @Test
    public void contextClickMethod() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        System.out.println(driver.getTitle());

       WebElement rectangle=driver.findElement(By.id("hot-spot"));

       // 1> Create Actions class
        Actions actions=new Actions(driver);

        // 2> Use Actions method

        //When use Right click on the box
        actions.contextClick(rectangle).perform();

        //Then verify the alert message is "You selected a context menu"
        Assert.assertEquals(driver.switchTo().alert().getText(),"You selected a context menu");
                         // (burasi actual, tek satirda yazmak icin kisayolla yapildi.***


        // Then accept the alert
        driver.switchTo().alert().accept();



    }
}

