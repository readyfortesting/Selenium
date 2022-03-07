package com.Batch44POM.tests.smoketestENG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Day14_CustomerCreation {
    LoginPage loginPage=new LoginPage();


    @Test
    public void createCustomerAsEmployee(){
        Driver.getDriver().get(ConfigReader.getProperty("gmi_login_url"));

       // Calling the loginApplication method to log in.
        loginPage.loginApplication("gino.wintheiser","%B6B*q1!TH");

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