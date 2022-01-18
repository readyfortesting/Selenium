package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //2: Youtube sayfasina gidelim
        driver.navigate().to("https://www.youtube.com");

        //3: amazon sayfasina gidelim
        driver.navigate().to("https://www.amazon.com");

        //4:  Tekrar youtube sayfasina donelim
        driver.navigate().back();

        //5. Yeniden amazon sayfasina donelim
        driver.navigate().forward();

        //6: Sayfayi refresh,yenile.
        driver.navigate().refresh();

        //7.Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.quit(); //quit driver'in actigi tum sayfalari kapatir.
                      // close(): Sadece driver'in son buldugu sayfayi kapatir.




    }
}
