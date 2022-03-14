package browserLogin;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	WebDriver driver;

	public void screenshotmethod() throws IOException 
	{
	String filewithpath="D:\\sel with java\\automationseed\\screenshot\\img";
	Date d= new Date(0);
	String FileName=d.toString().replace(":","_").replace(" ","_")+".png";
	File screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(screenshot, new File(filewithpath + FileName));
	}
}
