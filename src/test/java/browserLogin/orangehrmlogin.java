package browserLogin;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orangehrmlogin {
	

	
	
		
		WebDriver driver;
		@SuppressWarnings("deprecation")
		public void applaunch() throws Exception
		{
			
			
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe\\");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			String title=driver.getTitle();
			System.out.println("Title" + title);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
			//Thread.sleep(5000);
			
		   // driver.close();
		}
		
		
		 public void credentialstoapp() throws Exception
		 {
			 /* 
			 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			 Thread.sleep(3000);	
			 driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			 Thread.sleep(3000);
			 driver.findElement(By.linkText("/index.php/auth/requestPasswordResetCode")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.partialLinkText("/index.php/auth/requestP")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.className("button")).click();*/
		
		 //using xpath
		     driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin"); 
		     Thread.sleep(3000);
		     driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123"); 
		     Thread.sleep(3000);
		     driver.findElement(By.xpath("//input[@class='button']")).click();	 
	         
		     @SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 30);
		     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//legend[contains(text(),'Pending Leave Requests')]")));
		   //  clickonQuickLaunch("Leave list");
		    // String xpath="//span[contains(text(),'Leave List')]";
		    // driver.findElement(By.xpath(xpath)).click();	     
		     // driver.close();
		   // Assign Leave  
		     String xpath="//span[contains(text(),'Assign Leave')]";
		     driver.findElement(By.xpath(xpath)).click();
		     driver.findElement(By.xpath("//input[@name='assignleave[txtEmployee][empName]']")).sendKeys("Peter Mac Anderson");
		     Thread.sleep(3000);
		     driver.findElement(By.xpath("//textarea[@name='assignleave[txtComment]']")).sendKeys("Admin");
		     Thread.sleep(3000);
		 }
		 
		// public void clickonQuickLaunch(String quicklaunch)
		 //{
		 //    String xpath = "//span[contains(text(),'"+quicklaunch+"')]";
		 //    driver.findElement(By.xpath(xpath)).click();
		 //}
		 
	//	 public void clickcheckbox(String chkname, int val)
	//	{
	//		 driver.findElement(By.xpath("//label[contains(text(),'All')]/following: :input[@type='checkbox']"));
	//		for(int i=-1;i<size.i++) {
				
	//         driver.findElement(By.xpath("//label[contains(text(),'"+chkname+"')]/following: :input[@type='checkbox'and @value='"+ val +"']")).click();
	//		  break;
	//		 }
	//	 }
		 
	   
		 
		 
		// public void writeemployeename() throws Exception
		// {
		//     driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		//     Thread.sleep(3000);
		//     driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin"); 
		//     Thread.sleep(3000);
		// }
		public static void main(String args[]) throws Exception
		{
			ApplicationLogin app = new ApplicationLogin();
			app.applaunch();
			app.credentialstoapp();	

		}
				
	}


