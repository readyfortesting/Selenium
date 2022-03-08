package com.Batch44POM.tests.ParallelTestingTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;

import java.time.Duration;

public class LoginEmployee {


    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://demoqa.com/droppable");
        //2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
        Actions actions=new Actions(driver);
        WebElement tasinacakElement=driver.findElement(By.xpath("//div[text()='Drag me']"));
        WebElement tasinacakHedefElement=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));

        actions.dragAndDrop(tasinacakElement,tasinacakHedefElement).perform();

        //3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin

        String actualDroppedYazisi=tasinacakHedefElement.getText();
        String expectedDroppedYazisi="Dropped!";

        Assert.assertEquals(actualDroppedYazisi,expectedDroppedYazisi);

        driver.quit();
}
    }