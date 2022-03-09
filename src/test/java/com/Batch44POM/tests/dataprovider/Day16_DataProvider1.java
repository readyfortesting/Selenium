package com.Batch44POM.tests.dataprovider;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day16_DataProvider1 {





    /*     DATA PROVIDER METHOD
       1- create a  2 D array method
       2-  @DataProvider to provide data
       3- store test data in that method
      - How do you get data in test method?
       4-  @Test(dataProvider = "getData" (Method Name))
      NOTE: We can change the name using name parameter.
            @DataProvider(name="employeeInfo") this is OVERRIDE and optional not a must.
               and use that name in @Test("employeeInfo") here.
           */
    @DataProvider(name="employeeInfo")

    //Return type will be Object[][]
    public Object [] [] getData(){

        //We create employeeCredentials as to the ARRAY
        //It will be providing data for the test method.
        Object [] [] employeeCredentials ={
                {"gino.wintheiser","%B6B*q1!TH"}, // 1st username / password
                {"dallas.batz","dOWjuXz8*es6"},  // 2nd username / password
                {"leonel.skiles","x3uvYOf8hw1T"} // 3rd username / password

        };
        return employeeCredentials;
    }

      @Test(dataProvider = "getData")
    public void employeeLogin(String userName, String password){

        System.out.println(userName+" | "+password);

        /*
          gino.wintheiser | %B6B*q1!TH
              dallas.batz | dOWjuXz8*es6
            leonel.skiles | x3uvYOf8hw1T      */


        // HOW CAN WE USE @DataProvider ???
        // How can I get the credentials upstairs from an array?
        // With DataProvider we don't need to use any LOOP.

   /* Step 1: Use @DataProvider annotation in the class level.(it is coming from testng)
             Now,testng will know that this is going to provide data.

     Step 2: How will the @Test annotation see or connect the @DataProvider??
  ===>>>     @Test(dataProvider="getData")     <<<=====

    */


    }
}
