package SeleniumENGLISH;

import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Day11_ReadExcel  {

    @Test
    public void readExcel() throws IOException {
      //****   Workbook> Worksheet> Row> Cell   ***

         //Step 1=> Store the path of the file in a string
        String path="./src/test/java/resources/Country.xlsx";

        // Step 2=> Open the file
        FileInputStream fileInputStream=new FileInputStream(path); // it comes from Java

        // Step 3=> Open the workbook using FileInputStream
        Workbook workbook= WorkbookFactory.create(fileInputStream);

        // Step 4=> Open the first worksheet.
        Sheet sheet1=workbook.getSheetAt(0); // we chose 0 index because we will work on page 1.

        // Step 5=> Go to first row.
       Row row1=sheet1.getRow(0); //Cell 1 - Page1

        // Step 6=> Go to first cell on that first row and print.
        Cell cell1=row1.getCell(0);
        System.out.println("cell1 = " + cell1); // cell1 : COUNTRY

        // Step 7=> Go to second cell on that first row and print
        Cell cell2=row1.getCell(1);  // DATA TYPE IS = CELL NOT STRING!!!
        System.out.println("cell2 = " + cell2);
        System.out.println("cell2 = " + cell2.toString()); // For Assertion we can convert cell to String with - toString(); method.

        // Step 8=> Go to 2nd row 1st cell and assert if the date equal to USA
          // Cell row2Cell1=sheet1.getRow(1).getCell(0);
         // System.out.println("row2Cell1 = " + row2Cell1); // row2Cell1 = USA
        // for Verification (ASSERT) we should convert it to string ***** because ASSERION doesn't ACCEPT CELL data type.
        String  actualRow2Cell1=sheet1.getRow(1).getCell(0).toString();
        Assert.assertEquals(actualRow2Cell1,"USA");
        System.out.println("actualRow2Cell1 = " + actualRow2Cell1); // actualRow2Cell1 = USA

        // Step 9=> Go to 3rd row 2nd cell=chain the row and cell.
       // Cell row3Cell2=sheet1.getRow(2).getCell(1);
     //   System.out.println("row3Cell2 = " + row3Cell2);
        String row3Cell2=sheet1.getRow(2).getCell(1).toString();
        System.out.println("row3Cell2 > " + row3Cell2); // row3Cell2 > PARIS

        // Step 10=> Find the number of row 1
     //    we can also use this method to get a  TOTAL ROW NUMBER,


         int lastRowNumber=sheet1.getLastRowNum(); // This will return an int
        System.out.println("lastRowNumber = " + lastRowNumber); // lastRowNumber = 10

        int lastRowNumber1=sheet1.getLastRowNum()+1;
        System.out.println("lastRowNumber1 = " + lastRowNumber1);// lastRowNumber1 = 11
         // the index starts from ZERO so we should add +1 to get correct row number!!!!


        // Step 11=> Find the number of used row (NOT EMPTY,THERE IS A DATA)
       int numberOfRowUsed= sheet1.getPhysicalNumberOfRows();
        System.out.println("numberOfRowUsed = " + numberOfRowUsed); //numberOfRowUsed = 11
        // in this index starts from 1 so NO NEED to add 1 to match.

        // Step 12=> Print country, capital key value pairs as map object.
        // Our goal is to get the data from excel in a MAP to use it in Java classes.

        Map<String,String> countryCapital=new HashMap<>();  //using loop to get each cell data and store in the map.
         // row number 1 den baslasin 0'da Counrty var.
        for (int rowNumber= 1;rowNumber < lastRowNumber; rowNumber++){

          //  usa     =sheet1.getRow(1).getCell(0);
          //  france  =sheet1.getRow(2).getCell(0);
          //  england =sheet1.getRow(3).getCell(0);
          //  turkey  =sheet1.getRow(4).getCell(0);
        //    DC      = sheet1.getRow(1).getCell(1);
        //    paris   =sheet1.getRow(2).getCell(1);
         //   london  =sheet1.getRow(3).getCell(1);
         //   ankara  =sheet1.getRow(4).getCell(1);

            //PATTERN
            String countries=sheet1.getRow(rowNumber).getCell(0).toString();
            String capitals=sheet1.getRow(rowNumber).getCell(1).toString();
          //  System.out.println("countries = " + countries);
           // System.out.println("capitals = " + capitals);
            // to add the country capitals (KEY VALUE PAIRS) to MAP we use PUT

                //   Map<String,String> countryCapital=new HashMap<>();
            //I WILL CALL MY MAP  countryCapital
            // Map put function is used to add key value pairs inside the map.
            countryCapital.put(countries,capitals);

        }
        System.out.println("countryCapital = " + countryCapital); // We added them inside the MAP
//countryCapital = {GREECE=ATHENS, USA=D.C, CANADA=OTTOWA, GERMANY=BERLIN, TURKEY=ANKARA, JAPAN=TOKIO, ITALY=ROME, ENGLAND=LONDON, FRANCE=PARIS}

    }
}
