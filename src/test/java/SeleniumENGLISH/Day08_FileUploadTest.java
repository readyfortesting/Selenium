package SeleniumENGLISH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Day08_FileUploadTest extends TestBase {

       /* FILE UPLOAD TASK
        > Class name: FileUploadTest
        > Method Name: fileUploadTest
        > When user goes to https://the-internet.herokuapp.com/upload
        > When user selects an image from the desktop
        > And click on the upload button
        > Then verify the File Uploaded! Message displayed.
        */
    @Test
    public void fileUploadTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");

        // Step 1=> PATH OF THE IMAGE. Send the path of the file.
       Thread.sleep(4000);
        String pathOfTheImage=System.getProperty("user.home")+"\\Desktop\\New folder";



        // Step 2=> Send keys the path of the image.
       Thread.sleep(4000);
      WebElement uploadButton=driver.findElement(By.id("file-upload"));
      uploadButton.sendKeys(pathOfTheImage);

        // 3=> Click Upload
       WebElement submitButton=driver.findElement(By.id("file-submit"));
       submitButton.click();

        // 4=> Verify the file is uploaded
        String actualSuccessMessage=driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals(actualSuccessMessage,"File Uploaded");










    }


}
