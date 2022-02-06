package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Question_3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        /*
        // ...Exercise3...
// go to url : https://www.techlistic.com/p/selenium-practice-form.html
//fill the firstname
//fill the firstname
//check the gender
//check the experience
//fill the date
//choose your profession -> Automation Tester
//choose your tool -> Selenium Webdriver
//choose your continent -> Antartica
//choose your command  -> Browser Commands
//click submit button
         */

        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
        Thread.sleep(5000);


       // driver.findElement(By.xpath("//a[@class='cookie-choices-button'][2]")).click();

        //fill the firstname

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Burak");

      //  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Oguzhan");

        //fill the lasttname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Akyuz");

      //  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Yucedal");

        //check the gender
        // Select Gender
        driver.findElement(By.id("sex-0")).click();
       // driver.findElement(By.xpath("//input[@id='sex-0']")).click();


   //     driver.findElement(By.xpath("//input[@id='sex-0']")).click();
        //check the experience
        // Select Experience
        driver.findElement(By.id("exp-4")).click();
       // driver.findElement(By.xpath("//input[@id='exp-0']"));

           //   driver.findElement(By.xpath("//input[@id='exp-6']")).click();
        //fill the date
        // Enter Date
        driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.id("datepicker")).sendKeys("16-10-2020");
     //   driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("16.06.2022");


       // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("15.05.2030");
        //choose your profession -> Automation Tester
        driver.findElement(By.id("profession-1")).click();
      //  driver.findElement(By.xpath("//input[@id='profession-1']")).click();


     //  driver.findElement(By.xpath("//input[@id='profession-1']")).click();

        //choose your tool -> Selenium Webdriver
        driver.findElement(By.id("tool-2")).click();
        //driver.findElement(By.xpath("//input[@id='tool-2']")).click();

        //  driver.findElement(By.xpath("//input[@id='tool-2']")).click();

        //choose your continent -> Europa
        driver.findElement(By.id("continents")).click();
        WebElement dropdown = driver.findElement(By.id("continents"));
        dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();
        //driver.findElement(By.xpath("//select[@name='continents']")).sendKeys("Europa");


        //driver.findElement(By.xpath("//select[@id='continents']")).sendKeys("Africa");
        //choose your command  -> Browser Commands
        WebElement dropdown1 = driver.findElement(By.id("selenium_commands"));
        dropdown1.findElement(By.xpath("//option[. = 'Browser Commands']")).click();
        //driver.findElement(By.xpath("(//option[@style='margin:0;padding-bottom:0;padding-left:0;padding-right:0'])[12]")).click();


      // driver.findElement(By.xpath("//option[normalize-space()='Browser Commands']")).click();
        //driver.quit();

        // Scroll Vertical
      //  JavascriptExecutor js = null;
        //js.executeScript("window.scrollTo(0,675.5555419921875)");

        // Click Submit
        //driver.findElement(By.id("submit")).click();

    }
}
