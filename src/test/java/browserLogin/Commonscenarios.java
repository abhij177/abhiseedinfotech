package browserLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Commonscenarios {

	public static WebDriver driver;
	public static void selectdropdown(String value)
    {
	   Select dropdown =new Select(driver.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']")));
	   //dropdown.selectByIndex(0);
	   //dropdown.selectByValue(null);
	   dropdown.selectByVisibleText(value);
	 /*  if(value != null) {
		   dropdown.selectByVisibleText(value);
	   }
	   else 
	   {
		   System.out.println("Dropdown option is not present in list");
	   }*/
	
	
     }
	 @SuppressWarnings("deprecation")
	public static void clickonQuickLaunch(String quicklaunch)
	 {
	     String xpath = "//span[contains(text(),'"+quicklaunch+"')]";
	     driver.findElement(By.xpath(xpath)).click();
	     driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
	 }
}