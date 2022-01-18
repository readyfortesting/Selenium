package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");
        // driver.get ile ayni islemi yapar,daha hizlidir.

        driver.navigate().to("https://www.techproeducation.com");
        driver.navigate().back(); // Geldigi sayfaya geri doner.
        driver.navigate().forward();
        driver.navigate().refresh();
        // amazon sayfasi ile techproeducation sayfasi arasinda yeni bir driver acilirsa
        // techproeducation sayfasini yni bir sekmede açar ama eger yeni bir driver acilmazsa
        // ayni sayfada once amazon acilir kapandiktan sonra techproeducation sayfasi acilir-kapanir (back-forward methodlari sayesinde)
    }
}

