package com.Batch44POM.tests.ParallelTestingTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLogin {


    @DataProvider(name = "employeeInfo",parallel = true)

    //Return type will be Object[][]
    public Object[][] getData() {

        //We create employeeCredentials as to the ARRAY
        //It will be providing data for the test method.
        Object[][] employeeCredentials = {
                {"gino.wintheiser", "%B6B*q1!TH"}, // 1st username / password
                {"dallas.batz", "dOWjuXz8*es6"},  // 2nd username / password
                {"leonel.skiles", "x3uvYOf8hw1T"} // 3rd username / password

        };
        return employeeCredentials;
    }

    @Test(dataProvider = "getData")
    public void employeeLogin(String userName, String password) {

        System.out.println(userName + " | " + password);

    }
}