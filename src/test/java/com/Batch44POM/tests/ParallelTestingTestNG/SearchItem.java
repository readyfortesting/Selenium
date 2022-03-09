package com.Batch44POM.tests.ParallelTestingTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.ConfigReader;

import java.time.Duration;

public class SearchItem {

    @Test
    public void test01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2- https://www.amazon.com sayfasina gidelim
        //3- Arama kutusuna actions method’larine kullanarak Samsung A71 yazdirin
        // ve Enter’a basarak arama yaptirin
        //4- aramanin gerceklestigini test edin

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        Actions actions=new Actions(driver);
        actions.click(aramaKutusu).
                keyDown(Keys.SHIFT).
                sendKeys("s").
                keyUp(Keys.SHIFT).
                sendKeys("amsung ").
                keyDown(Keys.SHIFT).
                sendKeys("a").
                keyUp(Keys.SHIFT).
                sendKeys("71").
                sendKeys(Keys.ENTER).
                perform();


        Thread.sleep(5000);

        driver.quit();
    }
}