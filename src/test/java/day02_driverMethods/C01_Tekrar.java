package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    // Selenium'umn kendi IDE'si de var fakat biz daha kullanışlı olduğu için Intellij KULLANİYORUZ.
    // Intellij'de yeni bir proje actigimizda oncelikle selenium kutuphanelerini projeye eklememiz gerekir.
    // Biz en ilkel haliyle projemize kutuphaneleri ve jar dosyalari olarak yukledik.
    // Bu ekledigimiz dosyalarla artik driver'in ayarlarini yapabiliriz.

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        // setProperty methodu 2 parametre ister
        // İlki kullanacagimiz browser'a ait driver
        // İkinci parametre ise selenium sitesinden indirip projemize ekledigimiz chromedriver'in path'i
        // Windows kullanicilari sona .exe ekler, Mac kullananlar .exe eklememeli!

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        Thread.sleep(5000);
        // Java'dan gelir,icine yazilan milisaniye kadar kodlarin calismasini durdurur.

        driver.close();
        // Classi kapatmadan önce en sona yazilir.Bu kod calisinca driver'imiz kapanir
        // Bu koddan sonra yeniden bir browser açmak istiyorsak driver'a yenideger atamaliyiz.
          //  driver=new ChromeDriver();

    }
}
