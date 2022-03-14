package browserLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest extends BrowserLogin {
	public WebDriver driver;

  @Test
  public void credentialintoapp() throws Exception 
  {
	     driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin"); 
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123"); 
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@name='Submit']")).click();	 
	     WebDriverWait wait = new WebDriverWait(driver, 30);
	     //System.out.println("credentialintoapp");
	     
  }
  
 
}


