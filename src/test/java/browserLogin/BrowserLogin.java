package browserLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserLogin {
	WebDriver driver;
	
@BeforeClass
	  public void beforeclassexample()
	  {
		  System.out.println("hi im before class and im executing before every Test class");
	  }
	
	
  @BeforeMethod
  public void beforemethodexample()
  {
	  System.out.println("hi im executing before every Test Method");
  }
  @Test
  public void applaunch() 
  {
  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe\\");
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	String title=driver.getTitle();
	System.out.println("Title" + title);
	driver.manage().window().maximize();
//IMPLICIT WAIT
	driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
	System.out.println("applaunch");
  }
  
  @AfterMethod
  public void aftermethodexample()
  {
	  System.out.println("hi im executing after every Test Method");
  }
  
	
@AfterClass
	  public void afterclassexample()
	  {
		  System.out.println("hi im after class and im executing after every Test class");
	  }
	
  
}
