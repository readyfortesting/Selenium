package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
                            // Driver Type -               // Driver Path
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe ");

       // we are creating web driver object
        // Polymorphism
        WebDriver driver=new ChromeDriver();
        // Biz driver objesi oluşturduğumuzda boş bir web driver açılıp ona boş bir chrome browser açılır.

        driver.get("https://www.ebay.com");
        // driver.get methodu driver'a web adresini girmemizi sağlar.

        Thread.sleep(3000);
        driver.close();


    }
}
