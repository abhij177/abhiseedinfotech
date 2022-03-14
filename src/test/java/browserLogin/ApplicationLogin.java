package browserLogin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationLogin 
{
	
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
//IMPLICIT WAIT
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
//EXPLICIT WAIT
		WebDriverWait wait = new WebDriverWait(driver, 30);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//legend[contains(text(),'Pending Leave Requests')]")));
//EXPLICIT WAIT	  
	     
	     //To verify
	    // To check Visible:
	    /*	 if( driver.findElement(By.cssSelector("a > font")).isDisplayed()){

	    	 System.out.println("Element is Visible");

	    	 }else{

	    	 System.out.println("Element is InVisible");

	    	 }
	    	 */
  // USER MANAGEMENT ASSIGNMENT
	   /*  driver.findElement(By.xpath("//b[text()='Admin']")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath(" //input[@name='btnAdd']")).click();
	     Thread.sleep(3000);
	     
	     selectdropdown("Admin");
	     
	     driver.findElement(By.xpath("//input[@name='systemUser[employeeName][empName]']")).sendKeys("Akshay Bhagwan Pawar");
         
	     
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
	   //input[@name='_search']
	   //input[@name='searchSystemUser[userName]']
	   //input[@name='searchSystemUser[userName]']
	   //input[@name='systemUser[employeeName][empName]']
	   //input[@name='btnAdd']
	   //b[text()='Admin']
	     */
	   //  clickonQuickLaunch("Assign Leave");
	    // selectdropdown("US - Vacation");
	   //  String xpath="//span[contains(text(),'Leave List')]";
	    // driver.findElement(By.xpath(xpath)).click();	     
	     //driver.close();
	     
	     
 //RADIO BUTTON
	 /*    driver.findElement(By.xpath("//b[text()='My Info']")).click();

	       driver.findElement(By.xpath("//input[@value='Edit']")).click();	 
	       //input[@value='Edit']
	       boolean val = driver.findElement(By.xpath(" //label[contains(text(),'Male')]/..//input")).isSelected();
	       if(val)
	       {
	    	 System.out.println("Male is already selected");
	       }
	       else
	       {
	       driver.findElement(By.xpath(" //label[contains(text(),'Male')]/..//input")).click();
	       }*/
 //RADIO BUTTON
	     
	     
// to select CHECKBOX of ALL inside Leave List//
	    // driver.findElement(By.xpath("//label[contains(text(),'All')]//following::input[@type='checkbox'and @id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")).click();
	  
// to select CHECKBOX of Rejected inside Leave List//
	    // driver.findElement(By.xpath(" //label[contains(text(),'Rejected')]//following::input[@type='checkbox' and @value=\"-1\"]")).click();

	   //label[contains(text(),'Rejected')]//following::input[@type='checkbox' and @value="-1"]  
	   //label[contains(text(),'All')]//following :: input[@type='checkbox'] 
	     
	     
	     
	     
	     
	     
// Assign Leave  
	    // String xpath="//span[contains(text(),'Assign Leave')]";
	    // driver.findElement(By.xpath(xpath)).click();
	    // driver.findElement(By.xpath("//input[@name='assignleave[txtEmployee][empName]']")).sendKeys("Peter Mac Anderson");
	    // Thread.sleep(3000);
	    //driver.findElement(By.xpath("//textarea[@name='assignleave[txtComment]']")).sendKeys("hello Admin");
	    //Thread.sleep(3000);
	    // }
	 
	  //   public void clickonQuickLaunch(String quicklaunch)
	  //  {
	  //  String xpath = "//span[contains(text(),'"+quicklaunch+"')]";
	  //  driver.findElement(By.xpath(xpath)).click();
	   // }
	 
	    // public void clickcheckbox(String chkname, int val)
	    //{
	    // driver.findElements(By.xpath("//label[contains(text(),'All')]/following: :input[@type='checkbox']"));
	    /* List <WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		//int size = AllCheckboxes.size(); 
	    for(int i= -1 ; i<AllCheckboxes.size(); i++) {
			WebElement ele=AllCheckboxes.get(i);
			String value=ele.getAttribute("value");
			if(value.equalsIgnoreCase("-1"))
				ele.click();
			
        // driver.findElement(By.xpath("//label[contains(text(),'"+chkname+"')]/following: :input[@type='checkbox'and @value='"+ val +"']")).click();
		  break;
	    }*/
	    }
	  // USER MANAGEMENT ASSIGNMENT

	/* public void selectdropdown(String value )
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
     }*/
	/*    public void clickonQuickLaunch(String quicklaunch)
	    {
	    String xpath = "//span[contains(text(),'"+quicklaunch+"')]";
	    driver.findElement(By.xpath(xpath)).click();
	    }*/
	 
	 
 // DROPDOWN
        /* public void selectdropdown(String value )
        {
	    Select dropdown =new Select(driver.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']")));
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
        }*/
// DROPDOWN
	 
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
		//Commonscenarios obj = new Commonscenarios();
		//obj.clickonQuickLaunch("Assign Leave");
		//obj.selectdropdown("US - Vacation");

     	}
			
}
