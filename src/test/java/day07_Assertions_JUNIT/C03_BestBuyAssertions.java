/* package day07_Assertions;

public class C03 {

    import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

    public class C03_BestByAssertions {

        //  1) Bir class oluşturun: BestBuyAssertions
        //   2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak asagidaki testleri yapin
        //    3) Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
        //     4) titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
        //	5) logoTest => BestBuy logosunun görüntülendigini test edin
        // 	○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
        WebDriver driver;
        @Before
        public void setup(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().window().maximize();

        }

        @Test
        public void test01(){
            //  1) Bir class oluşturun: BestBuyAssertions
            //   2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak asagidaki testleri yapin.
            driver.get("https://www.bestbuy.com/");

            // 3: Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
            String actualURL=driver.getCurrentUrl();
            String expectedURL="https://www.bestbuy.com/";

            Assert.assertEquals("Lutfen test degerlerini gozden geciriniz",expectedURL,actualURL);

            // 4) titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin.
            String actualTitle=driver.getTitle();
            String istenmeyenKelime="Rest";
            // bu testin false olmasini istedigimiz icin Assert.false methodunu seceriz.
            Assert.assertFalse(actualTitle.contains(istenmeyenKelime));
            System.out.println("Bu satir calismaz");

            //   5) logoTest => BestBuy logosunun görüntülendigini test edin.
            WebElement logoElementi=driver.findElement(By.xpath("//img[@alt='Best Buy Logo'])[1]\""));
            // gorünmesini istedigimiz icin Assert.assertTrue methodunu seceriz.
            Assert.assertTrue("Lutfen test degerlerini gozden geciriniz",logoElementi.isDisplayed());

// 	6)  FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
            WebElement francais=driver.findElement(By.xpath("//button[text()='Français']"));
            Assert.assertTrue(francais.isDisplayed());






        }
        @After
        public void teardown(){
            // driver.close();

        }
    }
}
 */