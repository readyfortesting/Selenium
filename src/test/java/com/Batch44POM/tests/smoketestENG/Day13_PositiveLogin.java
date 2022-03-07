package com.Batch44POM.tests.smoketestENG;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Day13_PositiveLogin {

    LoginPage loginPage=new LoginPage();

    @Test
    public void login(){
        Driver.getDriver().get(ConfigReader.getProperty("gmi_login_url"));
        loginPage.loginDropdown.click();
        loginPage.signInButton.click();
        loginPage.username.sendKeys(ConfigReader.getProperty("employee_username"));
        loginPage.password.sendKeys("%B6B*q1!TH");
        loginPage.loginButton.click();



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