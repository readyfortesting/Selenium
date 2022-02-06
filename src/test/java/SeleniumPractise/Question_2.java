package SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Question_2 {
    public static void main(String[] args) {
                 /*
        //  ...Exercise2...
//  1-driver olusturalim
//  2-java class'imiza chromedriver.exe'yi tanitalim
//  3-driver'in tum ekrani kaplamasini saglayalim
//  4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
//    söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
//  5-"sahibinden.com" adresine gidelim
//  6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
//  7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim
//  8-Ardindan "gittigidiyor.com" adresine gidelim
//  9-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini
//    kontrol edelim
//  10-Bi onceki web sayfamiza geri donelim
//  11-sayfayi yenileyelim
//  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
//  13-En son adim olarak butun sayfalarimizi kapatmis olalim
         */
        //  1-driver olusturalim
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        //  2-java class'imiza chromedriver.exe'yi tanitalim
        WebDriver driver=new ChromeDriver();
        //  3-driver'in tum ekrani kaplamasini saglayalim
        driver.manage().window().maximize();
        //  4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
        //    söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //5-"sahibinden.com" adresine gidelim
        driver.get("https://www.sahibinden.com/");

        //  6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim.
        String shbndnSayfaTitle= driver.getTitle();
        String shbndnSayfaUrl=driver.getCurrentUrl();

        System.out.println("shbndnSayfaUrl = " + shbndnSayfaUrl);
        System.out.println("shbndnSayfaUrl = " + shbndnSayfaUrl);



        //  7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim

        if(shbndnSayfaTitle.contains("Oto"))
            System.out.println("Oto yazisi vardir");

        else
            System.out.println("Oto yazisi yoktur");

        if(shbndnSayfaUrl.contains("Oto"))
            System.out.println("Oto yazisi vardir");

        else
            System.out.println("Oto yazisi yoktur");

        //  8-Ardindan "gittigidiyor.com" adresine gidelim
        driver.get("https://www.gittigidiyor.com");

        //  9-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini
//    kontrol edelim

        boolean isTrue=driver.getTitle().contains("Sitesi");
        if (isTrue)
            System.out.println("Test Successful");
        else
            System.out.println("Test Failed");

        //  10-Bi onceki web sayfamiza geri donelim
        driver.navigate().back();
        //  11-sayfayi yenileyelim
        driver.navigate().refresh();

        //  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim.
        driver.navigate().forward();

//  13-En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();
    }
}
