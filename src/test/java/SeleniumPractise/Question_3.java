package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

        driver.findElement(By.xpath("//a[@class='cookie-choices-button'][2]")).click();
        //fill the firstname
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Oguzhan");
        //fill the lasttname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Yucedal");
        //check the gender
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();
        //check the experience
        driver.findElement(By.xpath("//input[@id='exp-6']")).click();
        //fill the date
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("15.05.2030");
        //choose your profession -> Automation Tester
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        //choose your continent -> Antartica
        driver.findElement(By.xpath("//select[@id='continents']")).sendKeys("Africa");
        //choose your command  -> Browser Commands
        driver.findElement(By.xpath("//option[normalize-space()='Browser Commands']")).click();

    }
}
