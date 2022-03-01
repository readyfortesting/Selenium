package SeleniumENGLISH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.List;

public class Day11_WebTables extends TestBase {
    // <table> tag is used to create a table
    //      <thead> is used to create a heading
    //            <tr> is used to create a table row
    //                <th> is used to create a table header data

    //     <tbody> is used to create a table body

    //            <td> is used to create a table cell

    // We can automate the webtables data using SELENIUM
    // We will interact the web elements,take care of the web elements using dynamic xpath.

     // HOW TO WRITE XPATH FOR TABLE ELEMENTS

    //- we can go from parent to child.
    //  Last name : Smith    xpath>>>>>     (//table[@id='table1'])//tbody//tr[1]//td[1]
    @Test
    public void printEntireTable(){
        driver.get("https://the-internet.herokuapp.com/tables");
        System.out.println("**** Print EntireTable Data ****");

        WebElement entireTable=driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println(entireTable.getText());

    }
@Test
    public void getRows(){ // this method will print ONLY the ROWS

    driver.get("https://the-internet.herokuapp.com/tables");
    System.out.println("**** Print Table Rows ****");
    List<WebElement> tableRows=driver.findElements(By.xpath("(//table[@id='table1'])//tbody//tr"));
    //how do you print the list??? =>> for each.
    int rowNum=1;

    for (WebElement eachRow:tableRows){
        System.out.println("Row Number "+rowNum+"=> "+eachRow.getText());
        rowNum++;

        /* **** Print Table Rows ****
           Row Number 1=> Smith John jsmith@gmail.com $50.00 http://www.jsmith.com edit delete
           Row Number 2=> Bach Frank fbach@yahoo.com $51.00 http://www.frank.com edit delete
           Row Number 3=> Doe Jason jdoe@hotmail.com $100.00 http://www.jdoe.com edit delete
           Row Number 4=> Conway Tim tconway@earthlink.net $50.00 http://www.timconway.com edit delete
         */

    }
}
@Test
    public void getRow3(){ // Only row 3
    driver.get("https://the-internet.herokuapp.com/tables");
    System.out.println("**** Print only 3rd Row ****");

    WebElement  row3=driver.findElement(By.xpath("(//table[@id='table1'])//tbody//tr[3]"));
    System.out.println(row3.getText());

    // **** Print only 3rd Row ****
    // Doe Jason jdoe@hotmail.com $100.00 http://www.jdoe.com edit delete


}
@Test
    public void getCellData(){ // All table Data one by one
        //All table Data

    driver.get("https://the-internet.herokuapp.com/tables");
    System.out.println("**** All Cell Data ****");

    int dataNumber=1;
        List<WebElement> allCellData=driver.findElements(By.xpath("(//table[@id='table1'])//tbody//td"));
    for (WebElement eachCellData: allCellData){
        System.out.println("Data Number "+" =>> "+eachCellData.getText());

        dataNumber++;


    }
}
@Test
    public void getColumn(){
        //get column 5
    driver.get("https://the-internet.herokuapp.com/tables");
    System.out.println("***** 5th Column Data");
   List<WebElement> column5thData=driver.findElements(By.xpath("(//table[@id='table1'])//tr//td[5]"));
    for (WebElement columnData : column5thData){
        System.out.println(columnData.getText());
    }

}



@Test
           //Create a printCellData method
           //printCellData(2,3) => 2nd row 3rd column
           //printCellData(1,2) => 1st row 4th column

    public void printCellData(int row, int column){  // this is exepts 2 parameters(int row, int column)
        // we used try cacth because if there isnt a row for example  we wrote row 7 and there is no row7 so that we could get message we used try catch.

        try {
            String dynamicXpath="//table[@id='table1']//tbody//tr["+row+"]//td["+column+"]";
            WebElement cellData=driver.findElement(By.xpath(dynamicXpath));
            System.out.println("cellData = " + cellData.getText());

        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();

        }

}
@Test
    public void printCellTest(){
    driver.get("https://the-internet.herokuapp.com/tables");
    printCellData(1,5);  // cellData =  row 1, cell 5:   http://www.jsmith.com
                                    // cellData =   row 2, cell 3:   fbach@yahoo.com
}                                  //  cellData =   row 3, cell 4:   $100.00

}
// Reusable method yaptik ve test olarak ustteki olusturdugumuz dynamic xpath cagirdik.!!!