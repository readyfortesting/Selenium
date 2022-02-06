package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Question_4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

         /*
        // ...Exercise5...
// Navigate to  https://testpages.herokuapp.com/styled/index.html
// Click on  Calculate under Micro Apps
//    Type any number in the first input
//    Type any number in the second input
// Click on Calculate
// Get the result
// Print the result
         */



        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        // Click on  Calculate under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
        //    Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("20");
        Thread.sleep(2000);

        driver.findElement(By.id("function")).click();
        //    Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("7");
        // Click on Calculate
        driver.findElement(By.id("calculate")).click();
        // Get the result

        driver.findElement(By.xpath("//span[@id='answer']")).getText();

        // close
       driver.quit();
    }
}
