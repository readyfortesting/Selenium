package com.Batch44POM.tests.dataprovider;

import org.testng.annotations.DataProvider;
import utilities.ExcelUtil;

public class Day16_DataProvider3 {

    @DataProvider(name = "employeeInfo")

    public Object[][] getData(){

        //1 = Need the path of the excel sheet
        String path="./src/test/java/resources/mysmoketestdata.xlsx";
       // 2 = Need sheet name on the excel sheet.
        String sheetName="employee_login_info";
        // 3= Need to intantiate the excel util object.
        ExcelUtil excelUtil=new ExcelUtil(path,sheetName);

        // Use getDataArrayWithoutFirstRow(); that will return all rows except the header!
        Object[][] employeeCredentials=excelUtil.getDataArrayWithoutFirstRow();



     return employeeCredentials;

    }

}
