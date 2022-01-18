package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle()); // driver.getTitle(): Sayfanin title'ini getirir.

        System.out.println(driver.getCurrentUrl());// driver.getCurrentUrl : sayfanin URL'sini yazdirir.

        System.out.println(driver.getWindowHandle());//driver.getWindowHandle() : Chrome'un ürettigi her bir sayfa için benzersiz bir numaradir.

        System.out.println(driver.getPageSource());//driver.getPageSource() : Kaynak dosyalarini gösterir,sayfanin arkasinda calisan kodlari gosterir.
    }
}
