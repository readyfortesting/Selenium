package SeleniumENGLISH;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day11_WriteExcel {
    //*** EXCEL SHEET IS USED TO CREATE A TEST DATA ****//

    // How can we write on the Excel data?
    // getCell()    =>>> using to READ
    // createCell() =>>> using to WRITE

    @Test
    public void writeExcel() throws IOException {

        // Step 1 : Create a new method writeExcel() =>  public void writeExcel()

        // Step 2 : Store the path of the file as string and open the file.
       String path="./src/test/java/resources/Country.xlsx";

        // Step 3 :Open the workbook.
        FileInputStream fileInputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fileInputStream);

        // Step 4 : Open the first worksheet.
      Sheet sheet1= workbook.getSheetAt(0);

        // Step 5 : Go to the first row
        Row row1=sheet1.getRow(0);

        // Step 6 : Create a cell on the 3rd column(2nd index) on the first row
        // createCell() =>>> using to WRITE
        Cell row1Cell3=row1.createCell(2);

        // Step 7 : Write POPULATION on that cell.
        row1Cell3.setCellValue("POPULATION"); // instead of sendKeys() we use setCellValue(); !!!! Because sendKeys doesn't send CELL DATA.

        // Step 8 : Create a cell on the 2nd row 3rd cell(index2), and write 150000
        sheet1.getRow(1).createCell(2).setCellValue(150000);

        // Step 9 : Create a cell on the 3rd row 3rd cell(index2) and write 250000
        sheet1.getRow(2).createCell(2).setCellValue(250000);

        // Step 10 : Create a cell on the 4th row 3rd cell (index2) and write 54000
        sheet1.getRow(3).createCell(2).setCellValue(540000);





        // WRITE AND SAVE THE WORKBOOK ****!!!!!
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream);


        // Step 11 : Close the file
        fileInputStream.close();
        fileOutputStream.close();

        // Step 12 : Close the workbook
        workbook.close();


    }


}
