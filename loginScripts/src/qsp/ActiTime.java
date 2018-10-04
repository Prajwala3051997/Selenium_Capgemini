package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime 
{
	static
    {
  	  System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
    }

	public static void main(String[] args) throws InterruptedException 
	{
      //launch the browser
		WebDriver driver=new ChromeDriver();
				
	  //enter the URL
	    driver.get("http://localhost/login.do");
	    
	  //get valid username
	    driver.findElement(By.id("username")).sendKeys("admin");
	    
	  //get valid password
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    
	  //click on login button
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    
	  //Displaying title of the page
	  String at = driver.getTitle();  
	  System.out.println(at);
	  
	  //URL of the page
	  String uat=driver.getCurrentUrl();
	  System.out.println(uat);
	  
	  Thread.sleep(2000);
	//Verification
	  if(at.equals("actiTIME - Login"))
	   {
		  System.out.println("test passed");
	   }
	  else
	   {
		  System.out.println("test failed");
	   }
	  	
	  
	driver.close();
	  
	}
}

