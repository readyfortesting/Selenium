package com.Batch44POM.tests.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Day16_DataProvider2 {

    // We will SEND the DATA.
    @DataProvider(name="employeeInfo")

    public Object [] [] getData(){


        Object [] [] employeeCredentials ={
                {"gino.wintheiser","%B6B*q1!TH"}, // 1st username / password
                {"dallas.batz","dOWjuXz8*es6"},  // 2nd username / password
                {"leonel.skiles","x3uvYOf8hw1T"} // 3rd username / password

        };
        return employeeCredentials;
    }


        @Test(dataProvider = "employeeInfo")
    public void employeeLogin(String userName, String password){

        // If you want to create a login related TestClass would you create everything from scratch
// like GMIBank login page from the very beginning, or would you check anything exist??
            // =>> We should do Reusable staff.

        }

}
