package utilities;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class TestBase {
    public   WebDriver driver;
  protected  ExtentHtmlReporter extentHtmlReporter;
   protected ExtentReports extentReports;
   protected ExtentTest extentTest;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // Path of the html report (root path, where we put the reports)
        String reportPath= System.getProperty("user.dir")+"/test-output/my_project_report.html";

        // Creating html report in the file path (it is just empty html file)
        extentHtmlReporter=new ExtentHtmlReporter(reportPath);

        // Creating extent report (this is creating entire structure, we are attaching extentHtmlReporter on the structure )
        extentReports=new ExtentReports();

        //ADDING CUSTOM (SPECIAL) INFORMATION (we added these 1 day later for more specific information)
        extentReports.setSystemInfo("Environment","Test Environment");
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Team","Team Deeplinks");
        extentHtmlReporter.config().setDocumentTitle("JUnit Reports");


        // Attaching html report the Extent report
        extentReports.attachReporter(extentHtmlReporter);

        // So far the report creating is DONE. (we can give the test name here)
        extentTest=extentReports.createTest("My Project Extent Reports","My first extent reports");

    }
    @AfterClass
    public void teardown(){
        //  driver.quit();
        extentReports.flush();  // to show the result we have to use at the end flush() !!!
    }
}