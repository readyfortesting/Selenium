package SeleniumENGLISH;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Day13_FirstDriverClass {

    @Test
    public void firstDriverClass(){
        // driver =>>>>>> Driver.getDriver()

      //  Driver.getDriver().get("https://www.amazon.com");
     //   Driver.getDriver().navigate().to("https://www.google.com");
        // without any issue I can go to the amazon and google.

   //**** We are using configuration file to get the urls, we do it because of reusability and making the code more dynamic.



        Driver.getDriver().get(ConfigReader.getProperty("AmazonUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));

        System.out.println("Google Title :"+ Driver.getDriver().getTitle());
        Driver.closeDriver();

    }
}
