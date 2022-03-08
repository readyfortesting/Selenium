package com.Batch44POM.tests.smoketestENG;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Day15_JSUtils {
    @Test
    public void scrollDown(){
        Driver.getDriver().get(ConfigReader.getProperty("gmi_login+url"));
   //     JSUtils.
    }





    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
// xml file'da Paralel calismasi icin her class sonunda
// @AfterMethod  koyulmasi gerekiyor.
//public void tearDown(){
//  Driver.closeDriver();
//    }