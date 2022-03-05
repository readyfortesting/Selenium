 package SeleniumENGLISH;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day03_Xpath {
    WebDriver driver;


    @Test

    public void xpath_css(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");


        //Locating emailbox using xpath
        WebElement emailBox=driver.findElement(By.xpath("//input[@id='session_email']"));
        //typing the email
        emailBox.sendKeys("testtechproed@gmail.com");
        //Locating password box using xpath
        WebElement passwordBox=driver.findElement(By.xpath("//input[@id='session_password']"));
        //typing password
        passwordBox.sendKeys("Test1234!");
        //Locating sign in button
        WebElement signInButton=driver.findElement(By.name("commit"));
        //clicking
        signInButton.click();

        driver.close();

    }
}

        /* Xpath: There are multiple ways of writing xpath and css.
        Xpath is powerful locator to find the elements.
        There are 2 types of Xpath, Absolute Xpath and Relative Xpath
        1-> Absolute Xpath : / is used for absolute xpath
        We don't use absolute Xpath in our codes.
        We go from parent (root element) the child  one by one.Not commonly used.Almost never used.
        It can be easily broken.
        XPATH=/parent/child/child/child/...

        2-> // is used to locate the relative xpath. We use Relative Xpath.
        * Go straight to any element on the page using.This is used a lot.
        Xpath =//tagname[@attribute='value']

        If there is a space in class it shouldn't be used.It may not work.It is not recommended.
        *If there is an id use id instead of Xpath,because id is a little bit faster than Xpath.

            * Which locator do you prefer?Why?
            -(The answer should be) I prefer id,because id is unique.
            - If there is no id, then I use other locators such as name.
            - If none of the regular locators works, then I write xpath,because I can write xpath for any elements.

         */










