package browserLogin;


	import java.io.FileInputStream;
	import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.testng.annotations.Test;

	import io.opentelemetry.exporter.logging.SystemOutLogExporter;

	public class Excelreadmultiple {
	 
	  public static void main(String[] args) throws IOException  {
		  FileInputStream fs = new FileInputStream("D:\\sel with java\\automationseed\\Automationdata.xlsx");
		  XSSFWorkbook wb = new XSSFWorkbook(fs);
	      XSSFSheet sheet = wb.getSheet("Sheet1");
	    
	     /* int rowcount=sheet.getLastRowNum();
	      for (int i=0;i<rowcount;i++)
	      {
	        int colcount=sheet.getRow(0).getLastCellNum();
	    	  XSSFRow currentrow=sheet.getRow(i);
	    	  for(int j=0;j<colcount;j++)
	    	  {
	    		  String value=currentrow.getCell(j).toString();
	    		  System.out.println("" +value);
	    		  
	    	  }
	    	  System.out.println();
	      }*/
	      int rows=sheet.getLastRowNum();
	      int cols=sheet.getRow(1).getLastCellNum();
	      for(int r=0;r<=rows;r++)
	      {
	    	  XSSFRow row=sheet.getRow(r);
	      
	    	  for(int c=0;c<cols;c++)
	    	  {
	    	        XSSFCell cell=row.getCell(c);
	    	 
	    	  switch(cell.getCellType())
	    	  {
	    	   case STRING:  System.out.print(cell.getStringCellValue());break;
	    	   case NUMERIC: System.out.print(cell.getNumericCellValue()); break;
	    	   case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
	    	  }
	    	  System.out.print("|"); 
	      }
	      System.out.println();
	      
	      
	      
	  }
	  }
	}
	


