package browserLogin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class amazontest extends amazonconfiguration{
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  
	//Xpaths  
	 String mobilename="//input[@name=\"field-keywords\"]";
	 String searchbutton="//input[@id=\"nav-search-submit-button\"]";
	 String iphone="Apple iPhone 12 (128GB) - Blue";
	 String addtocart="//input[@name=\"submit.add-to-cart\"]";
	 	
	 	
	 	 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe\\");
		  	driver = new ChromeDriver();
	//Reading from config file
		  	driver.get(configFileReader1("URL"));

		  	String title=driver.getTitle();
		  	System.out.println("Title" + title);
		  	driver.manage().window().maximize();
		  //IMPLICIT WAIT
		  	driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		  
	//Reading data from excel
	       	Xls_Reader reader = new Xls_Reader("D:\\sel with java\\automationseed\\amazonmobilephones.xlsx");
			  
				  String sheetname="Sheet1";
			  	int rowCount =reader.getRowCount(sheetname);
			  	for(int rowNum=2; rowNum<=rowCount; rowNum++) {
			  		String Mobilename= reader.getCellData(sheetname, "mobilename",rowNum);
			  	    System.out.println(Mobilename);
				     driver.findElement(By.xpath(mobilename)).sendKeys(Mobilename);
			  	}
     //Searching for mobile phone  
		  	//driver.findElement(By.xpath(mobilename)).sendKeys("I phone 12 128gb");
		     driver.findElement(By.xpath(searchbutton)).click();
		     driver.findElement(By.linkText(iphone)).click();
		     
	//windows handle  
		     //String winHandleBefore= driver.getWindowHandle();
		     for(String winHandle: driver.getWindowHandles()) {
		    	 driver.switchTo().window(winHandle);
		     }
	 //Adding to cart
		     driver.findElement(By.xpath(addtocart)).click();

	//Screenshot
		     screenshotmethod();

		  	//mobilename=driver.findElement(By.xpath(title))
		 //   FileInputStream fs = new FileInputStream("D:\\\\sel with java\\\\automationseed\\\\amazonmobilephones.xlsx");
			//  XSSFWorkbook wb = new XSSFWorkbook(fs);
			 // XSSFSheet sheet = wb.getSheetAt(0);
   
  }
 
//Screenshot 
	public void screenshotmethod() throws IOException 
	{
	String filewithpath="D:\\sel with java\\automationseed\\screenshot\\img";
	Date d= new Date(0);
	String FileName=d.toString().replace(":","_").replace(" ","_")+".png";
	File screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(screenshot, new File(filewithpath + FileName));
	}

}
