package browserLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssignmentOrangeHRM {
	WebDriver driver;

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
}
