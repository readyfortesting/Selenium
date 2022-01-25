/*package day05MavenBatch44;

public class C03 {
    import com.sun.tools.javac.Main;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

    public class C03 {
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            // amazon web sayfasina gidin
            driver.get("https://www.amazon.com/");

            // search kutusuna city bike yazip arattirin.
            WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
            aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

            // amazonda goruntulenen ilgili sonuclarin sayisini yazdirin.
            //WebElement sonucYazisiElementi= driver.findElement(By.className("a-section a-spacing-small a-spacing-top-small"));
            // System.out.println(sonucYazisiElementi.getText())
            // //WebElement ilkCikanUrunResmi= driver.findElement(By.id("a-page"));
            //  ilkCikanUrunResmi.click();
            WebElement sonucYazisiElementi=driver.findElement(By.xpath("//div[@class='sg-col-4-of-12 s-matching-dir sg-col-4-of-16 sg-col sg-col-4-of-20']"));
            System.out.println(sonucYazisiElementi.getText());

        }
    }
}
*/