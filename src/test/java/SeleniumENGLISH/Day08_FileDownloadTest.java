package SeleniumENGLISH;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day08_FileDownloadTest extends TestBase {
//Teacher said : FileDownload IS NOT VERY COMMON!!!!!
    @Test
    public void downloadTEST() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");

        //CLICKING ON THE LINK TO DOWNLOAD
       driver.findElement(By.linkText("Batman.jpg")).click();

       // Verify if the download is successful
        /**** when you click on the element (AFTER CLICKING) it takes 1-2 seconds to download it,
         * in that case IMPLICITLY WAIT WILL NOT HANDLE IT !
         * so we NEED to put some HARD WAIT (Thread.sleep) so that after we click the download can happen COMPLETELY!!!
        =>IF YOU DON"T PUT HARD WAIT YOUR TEST CASE WILL FAIL BECAUSE THE IMAGE WILL NOT BE DOWNLOADED COMPLETELY!!
         */
        Thread.sleep(2000);
       String filePath= System.getProperty("user.home")+"/Downloads/Batman.jpg";

       // Veryfication
        boolean isDownloaded=Files.exists(Paths.get(filePath)); //it is come from JAVA. we CANNOT checkt it with SELENIUM!!!!
        Assert.assertTrue(isDownloaded);
    }


}
