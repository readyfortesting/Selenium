package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class C08_ImplicitlyWait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // 

        driver.get("https://www.techproeducation.com");
        // Sayfanin acildigini goreyim sonra da kapatayim
        Thread.sleep(5000);// Ne olursa olsun 5 saniye bekler.
        driver.close();

    }
}
