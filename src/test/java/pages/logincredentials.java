package pages;

import org.testng.annotations.Test;

import base.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class logincredentials extends base{
 	static WebDriver driver;
 	String orangeusername="//input[@name='txtUsername']";
 	String orangepassword="//input[@name='txtPassword']";
 	String loginbutton="//input[@class='button']";
  	  
 @Test(priority=1)
	    
	    public void applaunch() 
	    {
	    System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe\\");
	  	driver = new ChromeDriver();
	  	//driver.get("https://opensource-demo.orangehrmlive.com/");
	  	driver.get(configFileReader("URL"));

	  	String title=driver.getTitle();
	  	System.out.println("Title" + title);
	  	driver.manage().window().maximize();
	  //IMPLICIT WAIT
	  	driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
	  	System.out.println("applaunch");
	    }
@Test(priority=2)
	    public void credentialstoapp() throws Exception
	  	 {
	    
	    //driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin"); 
	    driver.findElement(By.xpath(orangeusername)).sendKeys(configFileReader("USERNAME")); 

	    Thread.sleep(3000);
	    //driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123"); 
	    driver.findElement(By.xpath(orangepassword)).sendKeys(configFileReader("PASSWORD")); 
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(loginbutton)).click();	 
	  	 }
	    
	  }

  

