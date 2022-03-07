package com.Batch44POM.tests.ParallelTestingTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.ConfigReader;

import java.time.Duration;

public class CreateCustomer {

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(ConfigReader.getProperty("gmi_login_url"));
        driver.findElement(By.id("account-menu")).click();
        driver.findElement(By.xpath("(//*[text()='Sign in'])[1]")).click();
        driver.findElement(By.id("username")).sendKeys(ConfigReader.getProperty("employee_username"));
        driver.findElement(By.id("password")).sendKeys(ConfigReader.getProperty("employee_password"));
        driver.findElement(By.xpath("//button[@type='submit']")).click();


        driver.quit();


    }
}
