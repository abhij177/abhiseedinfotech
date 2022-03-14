package browserLogin ;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UsermanagementTest extends AssignmentOrangeHRM{
  @Test
  public void usermanagement() throws Exception {
	  
	  
	  driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin"); 
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123"); 
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@class='button']")).click();	 
      
	     @SuppressWarnings("deprecation")
//EXPLICIT WAIT
		WebDriverWait wait = new WebDriverWait(driver, 30);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//legend[contains(text(),'Pending Leave Requests')]")));
//EXPLICIT WAIT	     
	     
	     driver.findElement(By.xpath("//b[text()='Admin']")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath(" //input[@name='btnAdd']")).click();
	     Thread.sleep(3000);
	     
	     selectdropdown("Admin");
	     
	    // driver.findElement(By.xpath("//input[@name='systemUser[employeeName][empName]']")).sendKeys("Akshay Bhagwan Pawar");
	     driver.findElement(By.xpath("//input[@name='systemUser[employeeName][empName]']")).sendKeys("Aaliyah Haq");

	     //Aaliyah Haq
	     
	     driver.findElement(By.xpath("//input[@name='systemUser[userName]']")).sendKeys("abhilash"); 
	     Thread.sleep(3000);
	    
	     selectdropdown1("Enabled");
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath("//input[@name='systemUser[password]']")).sendKeys("admin123"); 
	     Thread.sleep(3000);
	    
	     driver.findElement(By.xpath("//input[@name='systemUser[confirmPassword]']")).sendKeys("admin123"); 
	     Thread.sleep(3000);
	    
	     driver.findElement(By.xpath("//input[@name='btnSave']")).click();
	     Thread.sleep(3000);
	     //search username
	     driver.findElement(By.xpath("//input[@name='searchSystemUser[userName]']")).sendKeys("abhilash"); 
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@name='_search']")).click();
	     Thread.sleep(3000);

  }
  //DROPDOWN
  public void selectdropdown(String value )
  {
	    Select dropdown =new Select(driver.findElement(By.xpath("//select[@id='systemUser_userType']")));
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
	    Select dropdown =new Select(driver.findElement(By.xpath("//select[@id='systemUser_status']")));
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
