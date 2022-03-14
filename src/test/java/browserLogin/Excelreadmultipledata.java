package browserLogin;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Excelreadmultipledata {
  @Test
  public static void main(String[] args) throws IOException  {
	  FileInputStream fs = new FileInputStream("D:\\sel with java\\automationseed\\Automationdata.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(fs);
      XSSFSheet sheet = wb.getSheet("Sheet1");
      int rowcount=sheet.getLastRowNum();
      int colcount=sheet.getRow(0).getLastCellNum();
      for (int i=0;i<rowcount;i++)
      {
    	  XSSFRow currentrow=sheet.getRow(i);
    	  for(int j=0;j<colcount;j++)
    	  {
    		  String value=currentrow.getCell(j).toString();
    		  System.out.println("" +value);
    		  
    	  }System.out.println();
      }
  }
}
