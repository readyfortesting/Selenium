 package SeleniumENGLISH;
 import io.github.bonigarcia.wdm.WebDriverManager;
 import org.junit.Assert;
 import org.junit.Test;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.chrome.ChromeDriver;

 import java.time.Duration;
 import java.util.List;

public class Page02_Locators {


//public class E02_Locators {

    //WebDriverManager.chromedriver().setup();


    /* WEB ELEMENT : Anything on the webpage is called webelement.
     * Button,search box, text box, headers, tables, etc.
     * There are different type of WebElement tags like <html>,<body>,<form>,<label>,<input>,<a>
     * We will inspect the HTML code to identify unique web elements for automation.
     * Together they create a webpage on the UI.
     */

    /* There are 8 selenium locators to locate an element.
    How to locate elements?
    WebElement elementName=driver.findElement(By.id("id value"));


 1->   >id => driver.findElement(By.id(""));
    id="session_email">
    This element has an id,This is unique,Then I can use this id to locate the element.

 2->   >name => driver.findElement(By.name(""));
 3->  >className => driver.findElement(By.className(""));
 4->    >tagName => driver.findElement(By.tagName(""));
 5->  >linkName => driver.findElement(By.linkText(""));
* LinkText accepts the full complete text with space and all.

 6->  >partialLinkText => driver.findElement(By.partialLinkText(""));
* partialLinkText accepts the full complete text or part of the text.
 7->  >xpath -> There are multiple ways to write xpath. => driver.findElement(By.xpath(""));
 8->   >css   -> There are multiple ways to write css. => driver.findElement(By.css(""));

     */

    @Test
    public void locators() throws InterruptedException{

        WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://a.testaddressbook.com/");

       // Location the email input
       driver.findElement(By.id("session_email")).sendKeys("testtechproed@gmail.com");

        // Locating the password and typing the password.
        driver.findElement(By.id("session_password")).sendKeys("Test1234!");

        // Locating sign-in button
        driver.findElement(By.name("commit")).click();

        //Verify that the expected user idtesttechproed@gmail.com
       WebElement userId= driver.findElement(By.className("navbar-text"));
        System.out.println(userId);
       String actualUserIdText= userId.getText();
        System.out.println(actualUserIdText);
        String expectedUserId="testtechproed@gmail.com";
        Assert.assertEquals("ID Test Fails",expectedUserId,actualUserIdText);

        //Verify the addresses and sign out texts are displayed.*/

    // I can also use linktext or partiallinktext because this is a link.
    //isDisplayed() return true if element is displayed.
    //Returns false if element is not displayed
     //   WebElement addressesElement=driver.findElement(By.LinkText("Addresses"));
    //   boolean addressesElementDisplayed=addressesElement.isDisplayed();
    //Assert.assertTrue(addressesElementDisplayed));

// sign out
    //  WebElement signOutElement=driver.findElement(By.ByLinkText("Sign out"));
    //    Assert.assertTrue(signOutElement.isDisplayed));

    // Find the number of total link on the page (interview question)
    // List<WebElement> allLinks=driver.findElements(By.ByTagName("a"));
    //  System.out.println("Totak number of link :"+allLinks.size));

    // Sign out from the page
//driver.findElement(By.partialLinkText("Sign o")).click();

    //Note: Make sure do the assertion for verifying the sign out is successful
    //  boolean isSignedOut=driver.getCurrentUrl().equals("https://a.testaddressbook.com/sign_in");
    // Assert.assertTrue(isSignedOut);

    // driver.quit();


  }
}
