package SeleniumENGLISH;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day10_Synchronization1 {
 WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
     //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void synchronization1(){

        // DO NOT USE TEST BASE, SINCE IMPLICIT WAIT IS ALREADY THERE.

        // Go to https://the-internet.herokuapp.com/dynamic_controls
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        // TASK 1=> Click on remove button
        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();

        /*
        After we click on the button, the It's gone! message take a few seconds.
        * Note that IF I DON'T USE WAIT, then element will not be found
        *** NoSuchElementException
        **** At this point we prefer EXPLICIT WAIT  for the message****
        *1. Create the WebDriverWait object
        *2. Use appropriate condition
         */

        // 1. Create the WebDriverWait object
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); // Selenium 4

        //  *2. Use for a specific condition
        //We have problem of visibility on the It's gone message, so we will wait for that locator.

        //EXPLICIT WAIT DOES THE FOLLOWINGS
        // 1. Waits for the element up to 10 secs.
        // 2. If the element is visible in 10 secs, then it RETURNS that element
        WebElement goneMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']"))); // this is very common using (visibilityOfElementLocated)
       // we don't have to use findElements here because  visibilityOfElementLocated FINDS the elements


        // TASK 2=> And verify the message is equal to "It's gone!"
        String goneMessageText=goneMessage.getText();

        Assert.assertEquals(goneMessageText,"It's gone!");

        // TASK 3 => Then click on Add button.
        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();

        // TASK 4 =>And verify the message is equal to "It's back!"
        // we don't have to use findElements here because  visibilityOfElementLocated FINDS the elements
         WebElement backMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
         String backMessageText=backMessage.getText();

         Assert.assertEquals(backMessageText,"It's back!");

        //  (//button[@type='button'])[2]

      // TASK 5 =>
      driver.findElement(By.xpath("(//button[@autocomplete='off'])[2]")).click();
        // we don't have to use findElements here because  visibilityOfElementLocated FINDS the elements.
        WebElement enabledMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
       String enabledMessageText=enabledMessage.getText();

       Assert.assertEquals(enabledMessageText,"It's enabled!");
        System.out.println("enabledMessageText = " + enabledMessageText);

    //    @AfterClass
     //   public void teardown(){
            // driver.quit();
        }
    }



