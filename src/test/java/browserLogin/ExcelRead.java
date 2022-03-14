package browserLogin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRead {
  @Test
  public void readexceldata() throws IOException  {
	  //public Row readexceldata() throws Exception {
	  //Path of the excel file
	  FileInputStream fs = new FileInputStream("D:\\sel with java\\automationseed\\Automationdata.xlsx");
	  //Creating a workbook
	 // XSSFWorkbook workbook = new XSSFWorkbook(fs);
	  XSSFWorkbook wb = new XSSFWorkbook(fs);

	  XSSFSheet sheet = wb.getSheetAt(0);
	 // XSSFSheet sheet = wb.getSheet("Automationdata");
	//  XSSFSheet sheet = workbook.getSheet("Automationdata");

	  Row row = sheet.getRow(0);
	  Cell cell = row.getCell(0);
	  System.out.println(sheet.getRow(0).getCell(0));
	  //row1 = sheet.getRow(1);
	  Row row1 = sheet.getRow(0);
      Cell cell1 = row1.getCell(1);
	  System.out.println(sheet.getRow(0).getCell(1));
	  Row row2 = sheet.getRow(1);
	  Cell cell2 = row2.getCell(1);
	  //Cell cell2 = row2.getCell(0);
	  System.out.println(sheet.getRow(1).getCell(0));
	  Row row3 = sheet.getRow(1);
	  Cell cell3 = row3.getCell(1);
	  System.out.println(sheet.getRow(1).getCell(1));
	 //return row1;
	  
	  
	/*  public int getSheetRows(String sheetName) {
          int index = wb.getSheetIndex(sheetName);
          wb.getSheetAt(index);
          return (sheet.getLastRowNum() + 1);
	  }*/
  }
}
