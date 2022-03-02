package SeleniumENGLISH;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.awt.image.Kernel;

public class Day11_ExtentReports extends TestBase {
    //To report we need to create some external dependencies.
   //  -> It can be used by Junit,TestNG,Cucumber. it is more famous with TestNG and Cucumber

    //*** There are 3 libraries to remember . They are all coming from dependency we added not from Selenium.
    /* 1 -> ExtentHtmlReporter extentHtmlReporter;
       2 -> ExtentReports extentReports;
       3 -> ExtentTest  extentTest;
           */
/*
 Extent reports,Reports?
=> Extent reports used for customizeD HTML reports.
=> It is used to add steps on the test case when needed.
=> We have the extent reports set ups in the TestBase(Report)
 */

    @Test
    public void extentReportsTest(){

        extentTest.pass("Going to the google home page");
        driver.get("https://www.google.com");

        extentTest.pass("Searching for iphone");
        driver.findElement(By.name("q")).sendKeys("iphone x"+ Keys.ENTER);

        extentTest.pass("Printing the result");






    }
}
