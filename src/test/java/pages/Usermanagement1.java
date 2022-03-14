package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.logincredentials;

public class Usermanagement1 extends logincredentials{
 	static WebDriver driver;
    String admin="//b[text()='Admin'] ";
    String adminbutton=" //input[@name='btnAdd']";
    String employeename="//input[@name='systemUser[employeeName][empName]']";
    String username="//input[@name='systemUser[userName]']";
    String password="//input[@name='systemUser[password]']";
    String confirmpassword="//input[@name='systemUser[confirmPassword]']";
    String savebutton="//input[@name='btnSave']";
    
    String searchusername="//input[@name='searchSystemUser[userName]']";
    String searchbutton="//input[@name='_search']";
    String dropdown1="//select[@id='systemUser_userType']";
    String dropdown2="//select[@id='systemUser_status']";
  @Test
  public void usermanagement() throws Exception {
	  
	  
	/*  driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin"); 
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123"); 
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@class='button']")).click();*/	 
      
	     @SuppressWarnings("deprecation")
//EXPLICIT WAIT
		WebDriverWait wait = new WebDriverWait(driver, 30);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//legend[contains(text(),'Pending Leave Requests')]")));
//EXPLICIT WAIT	     
	     
	     driver.findElement(By.xpath(admin)).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath(adminbutton)).click();
	     Thread.sleep(3000);
	     
	     selectdropdown("Admin");
	     
	    // driver.findElement(By.xpath("//input[@name='systemUser[employeeName][empName]']")).sendKeys("Akshay Bhagwan Pawar");
	     driver.findElement(By.xpath(employeename)).sendKeys(configFileReader("Employee"));

	     //Aaliyah Haq
	     
	     driver.findElement(By.xpath(username)).sendKeys(configFileReader("usernm")); 
	     Thread.sleep(3000);
	    
	     selectdropdown1("Enabled");
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath(password)).sendKeys(configFileReader("passwd")); 
	     Thread.sleep(3000);
	    
	     driver.findElement(By.xpath(confirmpassword)).sendKeys(configFileReader("confirmpw")); 
	     Thread.sleep(3000);
	    
	     driver.findElement(By.xpath(savebutton)).click();
	     Thread.sleep(3000);
	     //search username
	     driver.findElement(By.xpath(searchusername)).sendKeys(configFileReader("abhilash")); 
	     Thread.sleep(3000);
	     driver.findElement(By.xpath(searchbutton)).click();
	     Thread.sleep(3000);

  }
  //DROPDOWN
  public void selectdropdown(String value )
  {
	    Select dropdown =new Select(driver.findElement(By.xpath(dropdown1)));
	  //select[@id='systemUser_userType']
	    //dropdown.selectByIndex(0);
	    //dropdown.selectByValue(null);
	    //dropdown.selectByVisibleText(null);
	    if(value != null) {
		   dropdown.selectByVisibleText(value);
	    }
	    else 
	    {
		   System.out.println("Dropdown option is not present in list");
	    }
  }
	 
  
  public void selectdropdown1(String value )
  {
	    Select dropdown =new Select(driver.findElement(By.xpath(dropdown2)));
	  //select[@id='systemUser_userType']//select[@id='systemUser_status']
	    //dropdown.selectByIndex(0);
	    //dropdown.selectByValue(null);
	    //dropdown.selectByVisibleText(null);
	    if(value != null) {
		   dropdown.selectByVisibleText(value);
	    }
	    else 
	    {
		   System.out.println("Dropdown option is not present in list");
	    }
  }
}
