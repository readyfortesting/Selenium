package SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Question_1 { // Create a new class under
         // create main method
    public static void main(String[] args) {
        // Set Path
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        // Create chrome driver
        WebDriver driver=new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Set a wait for 15 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Open google home page https://www.google.com/
        driver.get("https://www.google.com/");

        // On the same class, Navigate to amazon home page https://www.amazon.com/ Navigate back to google
        driver.navigate().to("https://www.amazon.com/");

        //Navigate back to google
        driver.navigate().to("https://www.google.com/");

        // Navigate forward to amazon
        driver.navigate().forward();

        // Refresh the page
        driver.navigate().refresh();

        // Close/Quit the browser
        driver.quit();

        // And last step : print "all ok" on console.
        System.out.println("Everything is OKAY");












    }
}
